I know JaxRS is not on your resume, but it is very similar to specifying APIs using Spring or most other annotation-based Java web API frameworks, just different annotations are used. This page should be enough context to get it done : https://docs.oracle.com/javaee/6/tutorial/doc/gilik.html

Please read through the exercise fully before starting any work. You have 7 full days to complete the exercise, but it should not take more than a couple hours.

You have been tasked with designing a JaxRS ReSTful API to expose operations for a calendar application. Provide Java Interfaces that specify the API, do not implement any business logic.

The entities exposed by this API are (constructors, accessors and mutators excluded for brevity):

    @Entity
    public class Person {
      @Id
      private int id;
      private String name;
      private String email;
    }

    @Entity
    public class Meeting {
      @Id
      private int id;
      private Date start;
      private Date finish;
      private String description;
      @OneToMany
      private Set<Person> attendees;
    }

    @Entity
    public class Calendar {
      @Id
      private int id;
      private int month;
      private int year;
      @OneToMany
      private Set<Meeting> meetings;
      @OneToMany
      private Set<Person> sharedWith;
    }

The backend systems include (do not implement these):

* SchedulerEngine - Creates a list of times when a set of people are free to attend a meeting on a given day.

* CalenderSyncJob - Synchronizes calendar entries with another calendar system. Does not export attendees, only meetings for each calendar month.

The frontend UIs include (do not implement these):

* MonthlyCalendarApp - Shows the user a monthly calendar which shows all meetings for the month. A user can click on a meeting to see the attendees or reschedule.

* SchedulerApp - Allows a user to schedule a meeting including selecting attendees for the meeting.

Please create one or more service interfaces providing an API with enough functionality to meet the needs of these systems and UIs. Limit duplication of functionality as much as possible, but consider scalability in doing so.

Describe how your API solves each of the use cases for the backend systems and UIs.

Suggestions of additional functionality are welcome.
