# -*- coding: utf-8 -*- 
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys

#keyborad event
print("keyborad event你好=======")
driver = webdriver.Firefox()
driver.get("http://www.baidu.com")

# 输入框输入内容
driver.find_element_by_id("kw").send_keys("seleniumm")

sleep(5)
# 删除多输入的一个 m
driver.find_element_by_id("kw").send_keys(Keys.BACK_SPACE)


# 输入空格键+“教程”
sleep(2)
# driver.find_element_by_id("kw").send_keys(Keys.SPACE)
driver.find_element_by_id("kw").send_keys(u"教程")
sleep(5)

str="学习"
# driver.find_element_by_id("kw").send_keys(Keys.SPACE)
driver.find_element_by_id("kw").send_keys(str.decode('utf-8'))

# ctrl+a 全选输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'a')

# ctrl+x 剪切输入框内容
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'x')
sleep(5)

# ctrl+v 粘贴内容到输入框
driver.find_element_by_id("kw").send_keys(Keys.CONTROL, 'v')

# 通过回车键来代替单击操作
driver.find_element_by_id("su").send_keys(Keys.ENTER)
driver.quit()
