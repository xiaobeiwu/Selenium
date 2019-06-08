# -*- coding: utf-8 -*- 
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys


driver = webdriver.Firefox()
driver.get("https://www.baidu.com/")
print("by_id定位元素======")
driver.find_element_by_id("kw").send_keys("selenium")
driver.find_element_by_id("su").click()
driver.find_element_by_id("kw").clear()
driver.find_element_by_id("kw").send_keys("python")
driver.find_element_by_id("su").submit()
sleep(3)
print(driver.title)

driver.quit()

# bycss
print("by_css定位元素=======")
driver = webdriver.Firefox()
driver.get("https://www.163.com/")
text=driver.find_element_by_css_selector("a.ntes-nav-login-title").text
print(text)
driver.quit()


