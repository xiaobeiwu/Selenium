# -*- coding: utf-8 -*- 
from selenium import webdriver
from selenium.webdriver.support.select import Select
from time import sleep
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Firefox()
driver.implicitly_wait(10)
driver.get('http://www.baidu.com')

# 鼠标悬停至“设置”链接
link = driver.find_element_by_link_text('设置')
ActionChains(driver).move_to_element(link).perform()
sleep(1)
# 打开搜索设置
driver.find_element_by_link_text("搜索设置").click()
sleep(2)

# 搜索结果显示条数
sel = driver.find_element_by_xpath("//select[@id='nr']")
#下拉框选择“每页显示50条”
Select(sel).select_by_value('50')  

# ……
driver.quit()