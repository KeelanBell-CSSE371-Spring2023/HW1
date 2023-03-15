# HW1 Questions

By: Keelan Bell
Spring 2023

**1. In your own words, describe the overall problem the client is attempting to solve.**

In this assignment, the client is asking that we develop a software that helps to "streamline" the process of the Career Fair. That is, allow companies to find students who are more suited to their needs, as well as allowing students the opportunity to have at least one interview at the conclusion on a Career Fair. The main motivation for the client is to find a compromise between companies, who are looking to interview students that better suit their needs as far as interns go, and students, who may be at various levels of networking and communication experience and may need an extra hand in landing an interview.

**2. Categorize quoted statements from the original client statement above into the following cateogires from Leffingwell:**

a. Needs

* The client wants to disrupt the Career Fair model used by academic institutions.
* Companies spend a lot of time interviewing candidates who don’t meet their needs.
* Students are still working on their networking skills and aren’t able to utilize a Career Fair to its greatest potential.
* The client wants to provide additional access to and streamlining of parts of the hiring process.
* The client wants to match students with companies based on their skills and preferences.

b. Features

* Students upload resumes and work samples to the system.
* Resumes and work samples are rated by SMEs based on categories that are still to be determined.
* Companies provide their preferences for each category before a student receives an interview.
* The system recommends students for companies to interview based on their ratings and preferences.
* The application takes in three CSV files: student information, company information, and SME rankings.
* Companies may choose to restrict possible interviewees by their standing at Rose and the student's major.
* All students must be assigned at least one interview.
* Each company should be assigned enough interviewees to fill their interviewing schedule.
* All companies must be assigned at least five students.
* The system should be built in Java and run from the command line.
* The company information should be stored internally in a Linked List for fast search.

c. Software Requirements

* The system should be built in Java.
* The system should take in three CSV files: student information, company information, and SME rankings.
* The system should recommend students for companies to interview based on their ratings and preferences.
* The company information should be stored internally in a Linked List for fast search.
* The system should meet all the rules specified by the client.

**3. What was the most frustrating part of this homework assignment? Provide a professional (not ranting), detaile explanation of the difficulties you faced.**

I am not really frustrated with anything about this homework assignment, just more so that I don't want to put in "too much" work for a proof of concept and miss the point. Ultimately, I want the client to have a piece of software that is easy to edit and maintain, but in that journey I do not want to inconvenience myself as the developer or my client as the user by making something complicated for the beginning stages of conceptualization.

**4. What was your approach to this assignment? How did you proceed? What were the steps you took?**

I did the noun-verb approach, meaning I went through all of the nouns and verbs in the client's original email and categorized them. This was before we knew everything we know now about Needs, Features, and Software Requirements, but it was a similar approach to what we were taught to do in CSSE374. From there, I wanted to clarify exactly what the client needed and how the client wanted it done from there perspective. In doing that, I realized that a lot of things I wanted to implement or were wondering how to implement were not within the scope of this proof-of-concept workup.

**5. What did you feel worked well about your approach to the assignment? Provide a detailed explanation of the benefits of your approach.**

**6. If you had to do it over again, what would you change about your approach to this assignment? Provide a detailed explanation about the detriments of your original approach and how your new approach might fix these problems. If you wouldn't change anything, justify your answer.**

I don't think I would do anything over again. I think it's so early in the development process that I'm happy with the progress I've made and I feel like I've done a favor for myself by using a variation of the three-schema architecture because it's really helped me when making changes and slowly adding features.

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
* The company information is to be internally stored in a Linked List for rapid search.

**8. As this class is about Software Requirements Engineering (SRE), why do you think we asked you to implement this software? How does implementing the application relate to SRE?**

Implementing this software requires direct communication with a client. There are some obvious contingencies and problems with the things we are given, like the datasets having certain errors for example, and one of the important things we have learned so far about SRE is how imperative it is that we speak with our client and really understand what it is they want their software to do. All in all, the practicality of this software isn't really up to us to decide because we have to implement whatever the client wants, even if we disagree with the use of it.
