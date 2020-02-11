# Code-Fellowship



## LABS 16 - 19


#### Methods

* To run this you can import the app to IntelliJ and run it from there.

* The site should allow users to create an ApplicationUser on the “sign up” page.

* An ApplicationUser should have a username, password (will be hashed using BCrypt), firstName, lastName, dateOfBirth, bio, and any other fields you think are useful.

* This should include a default profile picture, which is the same for every user, and their basic information.

* The site should have a page which allows viewing the data about a single ApplicationUser, at a route like /users/{id}.

* Your Controller should have an @Autowired private PasswordEncoder passwordEncoder; and use that to run passwordEncoder.encode(password) before saving the password into the new user.

###### Credit

* Used <a href=https://stackoverflow.com/questions/7428039/java-constructor-method-with-optional-parameters>stackoverflow,</a> <a href="https://frontrowviews.com/Home/Event/Details/5e1fae3ceee6db204c8307fa">FrontRow</a> (Jan 27-31), and <a href=https://github.com/codefellows/seattle-java-401d7>Class Demos</a> (Jan 27-31) as references.
