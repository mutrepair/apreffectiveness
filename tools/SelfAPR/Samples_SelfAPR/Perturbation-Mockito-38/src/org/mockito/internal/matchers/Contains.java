[P1_Replace_Type]^private final char substring;^13^^^^^8^18^private final String substring;^[CLASS] Contains   [VARIABLES] 
[P8_Replace_Mix]^this.substring =  null;^16^^^^^15^17^this.substring = substring;^[CLASS] Contains  [METHOD] <init> [RETURN_TYPE] String)   String substring [VARIABLES] String  substring  boolean  
[P2_Replace_Operator]^return actual != null ||  (  ( String )  actual ) .contains ( substring ) ;^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P2_Replace_Operator]^return actual == null &&  (  ( String )  actual ) .contains ( substring ) ;^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P5_Replace_Variable]^return substring != null &&  (  ( String )  actual ) .contains ( actual ) ;^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P8_Replace_Mix]^return    (  ( String )  actual ) .contains ( substring ) ;^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P1_Replace_Type]^return actual != null &&  (  ( char )  actual ) .contains ( substring ) ;^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P14_Delete_Statement]^^20^^^^^19^21^return actual != null &&  (  ( String )  actual ) .contains ( substring ) ;^[CLASS] Contains  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] Object  actual  String  substring  boolean  
[P2_Replace_Operator]^description.appendText ( "contains ( \""  <<  substring + "\" ) " ) ;^24^^^^^23^25^description.appendText ( "contains ( \"" + substring + "\" ) " ) ;^[CLASS] Contains  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] String  substring  Description  description  boolean  
[P14_Delete_Statement]^^24^^^^^23^25^description.appendText ( "contains ( \"" + substring + "\" ) " ) ;^[CLASS] Contains  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] String  substring  Description  description  boolean  
