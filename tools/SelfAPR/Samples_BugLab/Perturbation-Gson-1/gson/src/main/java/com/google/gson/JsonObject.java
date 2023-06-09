[BugLab_Wrong_Operator]^Preconditions.checkArgument ( property == null ) ;^55^^^^^54^60^Preconditions.checkArgument ( property != null ) ;^[CLASS] JsonObject  [METHOD] add [RETURN_TYPE] void   String property JsonElement value [VARIABLES] String  property  boolean  Map  members  JsonElement  value  
[BugLab_Wrong_Operator]^if  ( value != null )  {^56^^^^^54^60^if  ( value == null )  {^[CLASS] JsonObject  [METHOD] add [RETURN_TYPE] void   String property JsonElement value [VARIABLES] String  property  boolean  Map  members  JsonElement  value  
[BugLab_Argument_Swapping]^members.put ( value, property ) ;^59^^^^^54^60^members.put ( property, value ) ;^[CLASS] JsonObject  [METHOD] add [RETURN_TYPE] void   String property JsonElement value [VARIABLES] String  property  boolean  Map  members  JsonElement  value  
[BugLab_Argument_Swapping]^return property.remove ( members ) ;^70^^^^^69^71^return members.remove ( property ) ;^[CLASS] JsonObject  [METHOD] remove [RETURN_TYPE] JsonElement   String property [VARIABLES] Map  members  String  property  boolean  
[BugLab_Argument_Swapping]^add ( value, createJsonElement ( property )  ) ;^81^^^^^80^82^add ( property, createJsonElement ( value )  ) ;^[CLASS] JsonObject  [METHOD] addProperty [RETURN_TYPE] void   String property String value [VARIABLES] Map  members  String  property  value  boolean  
[BugLab_Variable_Misuse]^add ( property, createJsonElement ( property )  ) ;^81^^^^^80^82^add ( property, createJsonElement ( value )  ) ;^[CLASS] JsonObject  [METHOD] addProperty [RETURN_TYPE] void   String property String value [VARIABLES] Map  members  String  property  value  boolean  
[BugLab_Argument_Swapping]^add ( value, createJsonElement ( property )  ) ;^92^^^^^91^93^add ( property, createJsonElement ( value )  ) ;^[CLASS] JsonObject  [METHOD] addProperty [RETURN_TYPE] void   String property Number value [VARIABLES] String  property  boolean  Number  value  Map  members  
[BugLab_Argument_Swapping]^add ( value, createJsonElement ( property )  ) ;^103^^^^^102^104^add ( property, createJsonElement ( value )  ) ;^[CLASS] JsonObject  [METHOD] addProperty [RETURN_TYPE] void   String property Boolean value [VARIABLES] String  property  boolean  Boolean  value  Map  members  
[BugLab_Argument_Swapping]^add ( value, createJsonElement ( property )  ) ;^114^^^^^113^115^add ( property, createJsonElement ( value )  ) ;^[CLASS] JsonObject  [METHOD] addProperty [RETURN_TYPE] void   String property Character value [VARIABLES] String  property  boolean  Character  value  Map  members  
[BugLab_Wrong_Operator]^return value != null ? JsonNull.createJsonNull (  )  : new JsonPrimitive ( value ) ;^124^^^^^123^125^return value == null ? JsonNull.createJsonNull (  )  : new JsonPrimitive ( value ) ;^[CLASS] JsonObject  [METHOD] createJsonElement [RETURN_TYPE] JsonElement   Object value [VARIABLES] Map  members  Object  value  boolean  
[BugLab_Argument_Swapping]^return memberName.containsKey ( members ) ;^144^^^^^143^145^return members.containsKey ( memberName ) ;^[CLASS] JsonObject  [METHOD] has [RETURN_TYPE] boolean   String memberName [VARIABLES] Map  members  String  memberName  boolean  
[BugLab_Argument_Swapping]^if  ( memberName.containsKey ( members )  )  {^154^^^^^153^159^if  ( members.containsKey ( memberName )  )  {^[CLASS] JsonObject  [METHOD] get [RETURN_TYPE] JsonElement   String memberName [VARIABLES] String  memberName  boolean  Map  members  JsonElement  member  
[BugLab_Argument_Swapping]^if  ( memberss.containsKey ( memberName )  )  {^154^^^^^153^159^if  ( members.containsKey ( memberName )  )  {^[CLASS] JsonObject  [METHOD] get [RETURN_TYPE] JsonElement   String memberName [VARIABLES] String  memberName  boolean  Map  members  JsonElement  member  
[BugLab_Argument_Swapping]^if  ( member.containsKey ( membersName )  )  {^154^^^^^153^159^if  ( members.containsKey ( memberName )  )  {^[CLASS] JsonObject  [METHOD] get [RETURN_TYPE] JsonElement   String memberName [VARIABLES] String  memberName  boolean  Map  members  JsonElement  member  
[BugLab_Wrong_Operator]^return member != null ? JsonNull.createJsonNull (  )  : member;^156^^^^^153^159^return member == null ? JsonNull.createJsonNull (  )  : member;^[CLASS] JsonObject  [METHOD] get [RETURN_TYPE] JsonElement   String memberName [VARIABLES] String  memberName  boolean  Map  members  JsonElement  member  
[BugLab_Argument_Swapping]^JsonElement member = memberName.get ( members ) ;^155^^^^^153^159^JsonElement member = members.get ( memberName ) ;^[CLASS] JsonObject  [METHOD] get [RETURN_TYPE] JsonElement   String memberName [VARIABLES] String  memberName  boolean  Map  members  JsonElement  member  
[BugLab_Argument_Swapping]^return  ( JsonPrimitive )  memberName.get ( members ) ;^168^^^^^167^169^return  ( JsonPrimitive )  members.get ( memberName ) ;^[CLASS] JsonObject  [METHOD] getAsJsonPrimitive [RETURN_TYPE] JsonPrimitive   String memberName [VARIABLES] Map  members  String  memberName  boolean  
[BugLab_Variable_Misuse]^return  ( JsonArray )  2.get ( memberName ) ;^178^^^^^177^179^return  ( JsonArray )  members.get ( memberName ) ;^[CLASS] JsonObject  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   String memberName [VARIABLES] Map  members  String  memberName  boolean  
[BugLab_Argument_Swapping]^return  ( JsonArray )  memberName.get ( members ) ;^178^^^^^177^179^return  ( JsonArray )  members.get ( memberName ) ;^[CLASS] JsonObject  [METHOD] getAsJsonArray [RETURN_TYPE] JsonArray   String memberName [VARIABLES] Map  members  String  memberName  boolean  
[BugLab_Argument_Swapping]^return  ( JsonObject )  memberName.get ( members ) ;^188^^^^^187^189^return  ( JsonObject )  members.get ( memberName ) ;^[CLASS] JsonObject  [METHOD] getAsJsonObject [RETURN_TYPE] JsonObject   String memberName [VARIABLES] Map  members  String  memberName  boolean  
[BugLab_Wrong_Literal]^boolean first = false;^194^^^^^192^207^boolean first = true;^[CLASS] JsonObject  [METHOD] toString [RETURN_TYPE] void   Appendable sb Escaper escaper [VARIABLES] Entry  entry  boolean  first  Map  members  Escaper  escaper  Appendable  sb  
[BugLab_Wrong_Literal]^first = true;^197^^^^^192^207^first = false;^[CLASS] JsonObject  [METHOD] toString [RETURN_TYPE] void   Appendable sb Escaper escaper [VARIABLES] Entry  entry  boolean  first  Map  members  Escaper  escaper  Appendable  sb  
[BugLab_Argument_Swapping]^sb.append ( entry.escapeJsonString ( escaper.getKey (  )  )  ) ;^202^^^^^192^207^sb.append ( escaper.escapeJsonString ( entry.getKey (  )  )  ) ;^[CLASS] JsonObject  [METHOD] toString [RETURN_TYPE] void   Appendable sb Escaper escaper [VARIABLES] Entry  entry  boolean  first  Map  members  Escaper  escaper  Appendable  sb  
[BugLab_Argument_Swapping]^entry.getValue (  ) .toString ( escaper, sb ) ;^204^^^^^192^207^entry.getValue (  ) .toString ( sb, escaper ) ;^[CLASS] JsonObject  [METHOD] toString [RETURN_TYPE] void   Appendable sb Escaper escaper [VARIABLES] Entry  entry  boolean  first  Map  members  Escaper  escaper  Appendable  sb  
