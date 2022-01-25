# TFI_tracker_app
Personal TFI program student logbook app using Android Studio in Kotlin 

Problem Statement :

I am facing a hard time keeping record of the "Teach for Ibrahimbagh" program attendees of my college. As a part of this program few students from the college must be sent everyday to the Ibrahimbagh Govt. School to teach the kids there. It's hard to report to the college management and the school management as there may be any missing log entries in the offline record because it is hard to maintain one. The location of the school is not recognized on Google maps so it's hard to reach there each time unless we save its location.


Proposed Solution :

A mobile application can be used effectively for maintaining a record so that it would be easy for me to report to both our college management and the school management with all the information available on my phone. This Project helps me save the details and feedback of TFI members that attend the program and can be sorted based on their year of study so that it would be easy to print their certificates accordingly at the end of the whole program. We also have search options so that we can filter them based on details(branch) or find records of a particular person based on their name etc; The app redirects you to google maps with the location of the school so that you can use it to get to the location or I can quickly share it to any member that is in need of it. It also redirects me to all the socials of TFI i.e instagram, whatsapp and facebook page so I can access them through the app. 


![My project](https://user-images.githubusercontent.com/70278957/148737022-284ff641-d134-44aa-a967-a26f111af374.png)

Functionality & Concepts used :

The App has a very simple and interactive interface which helps me keep a track of all the TFI program attendees. Following are few android concepts used to achieve the functionalities in app :

Constraint Layout : Most of the fragments in the app use a flexible constraint layout, which is easy to handle for different screen sizes.
Simple & Easy Views Design : Use of EditText with hints and interactive buttons.
Navigation components: App uses navigation components to switch between different screens.
RecyclerView : To present the list of details of members we used the efficient recyclerview. 
LiveData & Room Database : We are also using LiveData to update and add new member details.

Source code is present in the master branch:
https://github.com/Vennela-png/Tfi_tracker_app/tree/master

Application Link & Future Scope :

You can access the app : https://drive.google.com/file/d/1yIQDoJky6mJ6RmRTSafKOEugB9pML0xt/view?usp=sharing

We would like to make an app with admin and student login so that students can access the socials, location and upcoming events of the program where as the admin can make changes in the events and can keep track of the members.
