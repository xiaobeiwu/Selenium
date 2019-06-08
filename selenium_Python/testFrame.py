# -*- coding: utf-8 -*- 
from selenium import webdriver
from time import sleep

driver = webdriver.Firefox()
driver.get("http://www.126.com")

#切换到iframe表单
i=driver.find_element_by_tag_name("iframe")
driver.switch_to_frame(i)
driver.find_element_by_name("email").clear()
sleep(3)
driver.find_element_by_name("email").send_keys("username")

driver.find_element_by_name("password").clear()
sleep(3)
driver.find_element_by_name("password").send_keys("password")
sleep(3)
driver.find_element_by_id("dologin").click()
driver.switch_to.default_content()

driver.quit()