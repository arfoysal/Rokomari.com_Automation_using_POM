
# Rokomari.com Automation using using Page object Model

## Technology used
  
- Test tool:  Selenium Webdriver 
- Language: Java  
- Architecture: POM
- Framework: TestNG
- IDE: Eclipse  
  
## Pre Requisites:
  
- Open/install Java JDK 16 version on your PC  
- Install Maven on your PC  
- Install TestNG on your IDE  
- Install Eclipse/STS or any other IDE  
- Setup Java, Maven environment on your PC  
- Chrome Browse  

## Requirements:
  
### These steps are executed:

#### TestCase 01: Test_001_HomePage

- Open the Opera browser
- Go to Rokomari Web Site
- Maximize the browser window
- Wait for complete Pageload
- Perform Unit testng 
- Take a screenshot 

#### TestCase 02: Test_002_SignUpWithGoogle

- Hover on Sign In button
- click on Sign up with Google button
- Perform unit testng
- Provide gmail credential and complete Sign up/ Sign IN
- Perform unit testng & highlights username 
- Take a screenshot 

#### TestCase 03: Test_003_SelectProduct
- Hover on লেখক & click-on হুমায়ূন আহমেদ
- Wait for Complete Pageload
- Fileter Category by selecting সমকালীন উপন্যাস and রচনা সংকলন ও সমগ্র
- Scroll down and and click on next for move to nextpage 
- Wait for Complete Pageload
- Select the fourth book on the page to add-to-card
- Perform unit testng
- Take screenshot

#### TestCase 04: Test_004_MyCartPage

- Click cart icon to go-to My-cart page 
- Wait for Complete Pageload
- Perform unit testng
- Take screenshot

#### TestCase 05: Test_005_ShippingPage

- Click on Go to Shipping Page Button
- Wait for Complete Pageload
- Fill-up forms wih with name & phone number
- Select বান্দরবান form drop-down as a City
- Select রোয়াংছড়ি form drop-down as an Area
- Select নোয়াপতং ইউনিয়ন form drop-down as a Zone
- Provide address text in text field 
- Select COD as payment option
- Scroll-down & Highlights Confirm Order Button
- Perform unit testng
- Take Screenshot

#### TestCase 06: Test_006_Logout

- Click on User Name Button
- Click on User sign Out Button form drop-down 
- Perform unit testng
- Take Screenshot
- Close browser


## Run the script:
- Set Configure build path libraries with JRE System Library 1.8 or above 
- Create a .env file in home directory and write...  
```
    email = "Enter your G-suit gmail address"  
    pass = "Enter your email password"  
    name = "Enter your gmail name"  
    coustomer_name = "Enter Product recipients name"  
    number = "Enter Product recipients phone number"
```
- Right Click on testng.xml file
- Then select Run as TestNG
- Run the Test Cases
- Close the program


## Authors

- [@arfoysal](https://www.github.com/arfoysal)

