# HW1 Revised Questions

By: Keelan Bell
Spring 2023

**1. In your own words, describe the overall problem the client is attempting to solve.**

In this assignment, the client is asking that we develop a software that helps to "streamline" the process of the Career Fair. That is, allow companies to find students who are more suited to their needs, as well as allowing students the opportunity to have at least one interview at the conclusion on a Career Fair. The main motivation for the client is to find a compromise between companies, who are looking to interview students that better suit their needs as far as interns go, and students, who may be at various levels of networking and communication experience and may need an extra hand in landing an interview.

(Didn't change.)

**2. Categorize quoted statements from the original client statement above into the following cateogires from Leffingwell:**

a. Needs

* The client aims to revolutionize the traditional Career Fair model used by academic institutions.
* Companies currently spend too much time interviewing candidates who don't fulfill their requirements.
* Students often lack advanced networking skills, limiting their ability to take full advantage of Career Fairs.
* The client seeks to improve and streamline aspects of the hiring process.
* The client wants a system that matches students with companies based on skills and preferences.

b. Features

* Students upload resumes and work samples to the platform.
* Subject Matter Experts (SMEs) rate resumes and work samples based on specific categories.
* Companies provide their category preferences for potential interviewees.
* The system recommends student interviewees to companies based on ratings and preferences.
* The application processes three CSV files: student information, company information, and SME ratings.
* Companies have the option to filter potential interviewees by academic standing and major.
* Every student must receive at least one interview opportunity.
* Each company is assigned enough interviewees to fill their interviewing schedule.
* A minimum of five students must be assigned to every company.

c. Software Requirements

* The system must be developed using Java.
* The system needs to process three CSV files: student information, company information, and SME ratings.
* The system should recommend students for companies to interview, taking into account ratings and preferences.
* Company information should be stored internally in a Linked List to enable fast search capabilities.
* The system must adhere to all the rules and guidelines provided by the client.

**3. What was the most frustrating part of this homework assignment? Provide a professional (not ranting), detaile explanation of the difficulties you faced.**

I am not really frustrated with anything about this homework assignment, just more so that I don't want to put in "too much" work for a proof of concept and miss the point. Ultimately, I want the client to have a piece of software that is easy to edit and maintain, but in that journey I do not want to inconvenience myself as the developer or my client as the user by making something complicated for the beginning stages of conceptualization.

(Didn't change.)

**4. What was your approach to this assignment? How did you proceed? What were the steps you took?**

[I did the noun-verb approach, meaning I went through all of the nouns and verbs in the client's original email and categorized them. This was before we knew everything we know now about Needs, Features, and Software Requirements, but it was a similar approach to what we were taught to do in CSSE374. From there, I wanted to clarify exactly what the client needed and how the client wanted it done from there perspective. In doing that, I realized that a lot of things I wanted to implement or were wondering how to implement were not within the scope of this proof-of-concept workup.] _Keeping because it's still relevant, but adding more._

In reality, the first thing I did was develop a list of questions to send to the client. From there, it would be a bit of a back and forth in communicating with the client, developing code until I had another question, then sending the client another email and subsequently doing that over and over and over. Some questions I didn't know I had until I was trying to implement something, and then saw that there was invalid data or missing data, or something of that sort. 

**5. What did you feel worked well about your approach to the assignment? Provide a detailed explanation of the benefits of your approach.**

I think what worked well was beginning my implentation in a flexible way that made changing code easy as I found out more information. For example, the four-schema architecutre I used made it so that it was very easy to find the places where I needed to change things to appease the client or to slighty edit things compared to what the client had specified. 

**6. If you had to do it over again, what would you change about your approach to this assignment? Provide a detailed explanation about the detriments of your original approach and how your new approach might fix these problems. If you wouldn't change anything, justify your answer.**

One of the things I wish I could do again is know what I know now about the kinds of questions and how thorough we have to be to get the correct data and correct information from the client. I hadn't realized there were slight data validation issues and certain things that were being left out on purpose to force us to contact the client and ask those questions, and sometimes it was already too late to the point where it put my developing on pause until 24 hours later when I heard back from the client.

**7. Many of the Needs, Features, and Software Requirements from problem 2 are not in the format we've discussed in class. Provide the final list of Needs and Features that you followed to implement your application. Ensure the Needs and Features use the format from class.**

a. Needs

* The client desires to innovate the Career Fair model currently used by academic institutions.
* Companies waste considerable time interviewing candidates who do not meet their needs.
* Students face difficulties utilizing Career Fairs to their fullest potential due to networking skill limitations.
* The client aims to offer supplementary access and streamline the hiring process.
* The client intends to match students with companies based on their skills and preferences.

b. Features

* The system permits students to upload their resumes and work samples.
* The system allows for rating of resumes and work samples by SMEs based on five categories yet to be determined.
* Companies can specify their preferences for each category before a student receives an interview.
* The system recommends students for companies to interview based on the ratings and preferences.
* The application ingests three CSV files: student information, company information, and SME rankings.
* Companies have the option to restrict possible interviewees by Rose standing and the student's major.
* Every student must receive at least one interview, while each company is assigned enough interviewees to fill their schedule.
* Every company must be assigned at least five students.
* The system is to be built in Java and operate from the command line.

**8. As this class is about Software Requirements Engineering (SRE), why do you think we asked you to implement this software? How does implementing the application relate to SRE?**

Implementing this software requires direct communication with a client. There are some obvious contingencies and problems with the things we are given, like the datasets having certain errors for example, and one of the important things we have learned so far about SRE is how imperative it is that we speak with our client and really understand what it is they want their software to do. All in all, the practicality of this software isn't really up to us to decide because we have to implement whatever the client wants, even if we disagree with the use of it.

(Didn't change.)