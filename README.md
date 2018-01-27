# MyExampleCodeBits
A place for misc code

Set up for creating Twitter Bots
=====
* Create Twitter account
  * Create Twitter App - this gives you the Twitter crendials you need
* Create AWS account
  * Create AWS EC2 instance
    * Select Amazon Linux, and all the default values
  * Install Twython
    * sudo pip install twython

TwitterBotFindHashtagAndEmail.py
=====
* This script searchs for a specific hashtag, and emails the results
* Need to set up AWS SES (Simple Email Service) Good guide here: https://docs.aws.amazon.com/ses/latest/DeveloperGuide/send-using-sdk-python.html

