# SwagLabs

My framework is  based on DD and BD Cucumber framework.
I used Java as programming language.I used Selemiunm tool to automate the browser and Maven as my build automation tool,for dependency management but also as 
command prompt tool using the pom.xml file.
I created conf.properties type of file to store my important test data about my framework.Here I keep test data that can change  the running flow of the whole 
framework such as browser,username,password,url.I created configuration reader in  utilities class to be able to read the data from conf.properties.
I have resources directory where I created features package where I store all my feature files.
I implemented  BBD approach to simplify reading and understanding my framework for the non-technical teammates.
After feature packages I created step definition package,here I impelmented the actual coding logic .In step definition I instantiate page classes,so I created
page objects that allow us to interact with page elements.
To be able to run my test cases I created the Runners package.This package is the triggering point of my framework.I am also created Driver class in utility package that 
uses singleton design pattern to create and use only one universal webdriver.
I also have Browser util class in utility package for reussable methods.I also used junit for verification.
