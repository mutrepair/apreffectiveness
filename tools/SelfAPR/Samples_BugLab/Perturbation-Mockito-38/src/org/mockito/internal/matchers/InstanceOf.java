[BugLab_Argument_Swapping]^return  ( clazz != null )  && actual.isAssignableFrom ( actual.getClass (  )  ) ;^20^^^^^19^21^return  ( actual != null )  && clazz.isAssignableFrom ( actual.getClass (  )  ) ;^[CLASS] InstanceOf  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Class  clazz  Object  actual  boolean  
[BugLab_Wrong_Operator]^return  ( actual != null )  || clazz.isAssignableFrom ( actual.getClass (  )  ) ;^20^^^^^19^21^return  ( actual != null )  && clazz.isAssignableFrom ( actual.getClass (  )  ) ;^[CLASS] InstanceOf  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Class  clazz  Object  actual  boolean  
[BugLab_Wrong_Operator]^return  ( actual == null )  && clazz.isAssignableFrom ( actual.getClass (  )  ) ;^20^^^^^19^21^return  ( actual != null )  && clazz.isAssignableFrom ( actual.getClass (  )  ) ;^[CLASS] InstanceOf  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Class  clazz  Object  actual  boolean  
[BugLab_Variable_Misuse]^description.appendText ( "isA ( " + 1.getName (  )  + " ) " ) ;^24^^^^^23^25^description.appendText ( "isA ( " + clazz.getName (  )  + " ) " ) ;^[CLASS] InstanceOf  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] Class  clazz  Description  description  boolean  
[BugLab_Wrong_Operator]^description.appendText ( "isA ( " + clazz.getName (  ||  )  + " ) " ) ;^24^^^^^23^25^description.appendText ( "isA ( " + clazz.getName (  )  + " ) " ) ;^[CLASS] InstanceOf  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] Class  clazz  Description  description  boolean  
[BugLab_Wrong_Operator]^description.appendText ( "isA ( "  |  clazz.getName (  )  + " ) " ) ;^24^^^^^23^25^description.appendText ( "isA ( " + clazz.getName (  )  + " ) " ) ;^[CLASS] InstanceOf  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] Class  clazz  Description  description  boolean  
