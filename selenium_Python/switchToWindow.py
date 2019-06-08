# -*- coding: utf-8 -*- 
from selenium import webdriver
from time import sleep

driver = webdriver.Firefox()
driver.implicitly_wait(10)
driver.get("http://www.baidu.com")

# 获得百度搜索窗口句柄
sreach_windows = driver.current_window_handle
print(sreach_windows)

driver.find_element_by_link_text('登录').click()
sleep(2)
driver.find_element_by_link_text("立即注册").click()
sleep(2)
# 获得当前所有打开的窗口的句柄
all_handles = driver.window_handles
print(all_handles)

# 进入注册窗口
for handle in all_handles:
    if handle != sreach_windows:
		driver.switch_to.window(handle)  #切换窗口
		print('now register window!'+handle)
		sleep(30)
		driver.find_element_by_xpath("//input[@class='pass-text-input pass-text-input-userName' and @name='userName']").send_keys("username")
	
		driver.find_element_by_xpath("//input[@class='pass-text-input pass-text-input-password' and @name='password']").send_keys("password")
		
		sleep(2)
		# ……


driver.quit()