[P1_Replace_Type]^private static final  short  serialVersionUID = 1678353579659253473L;^42^^^^^37^47^private static final long serialVersionUID = 1678353579659253473L;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = 1678353579659253473;^42^^^^^37^47^private static final long serialVersionUID = 1678353579659253473L;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry   [VARIABLES] 
[P5_Replace_Variable]^super ( 1 ) ;^69^^^^^68^70^super ( set ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Set)   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^69^^^^^68^70^super ( set ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Set)   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P11_Insert_Donor_Statement]^super ( iterator ) ;super ( set ) ;^69^^^^^68^70^super ( set ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Set)   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P11_Insert_Donor_Statement]^super ( entry ) ;super ( set ) ;^69^^^^^68^70^super ( set ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Set)   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P14_Delete_Statement]^^153^^^^^152^154^super ( iterator ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Iterator)   Entry<K, V>> iterator [VARIABLES] Iterator  iterator  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^super ( set ) ;super ( iterator ) ;^153^^^^^152^154^super ( iterator ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Iterator)   Entry<K, V>> iterator [VARIABLES] Iterator  iterator  long  serialVersionUID  boolean  
[P11_Insert_Donor_Statement]^super ( entry ) ;super ( iterator ) ;^153^^^^^152^154^super ( iterator ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Iterator)   Entry<K, V>> iterator [VARIABLES] Iterator  iterator  long  serialVersionUID  boolean  
[P14_Delete_Statement]^^174^^^^^173^175^super ( entry ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Map$Entry)   Entry<K, V> entry [VARIABLES] long  serialVersionUID  Entry  entry  boolean  
[P11_Insert_Donor_Statement]^super ( set ) ;super ( entry ) ;^174^^^^^173^175^super ( entry ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Map$Entry)   Entry<K, V> entry [VARIABLES] long  serialVersionUID  Entry  entry  boolean  
[P11_Insert_Donor_Statement]^super ( iterator ) ;super ( entry ) ;^174^^^^^173^175^super ( entry ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Map$Entry)   Entry<K, V> entry [VARIABLES] long  serialVersionUID  Entry  entry  boolean  
[P2_Replace_Operator]^if  ( set  <  Unmodifiable )  {^55^^^^^54^59^if  ( set instanceof Unmodifiable )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P15_Unwrap_Block]^return set;^55^56^57^^^54^59^if  ( set instanceof Unmodifiable )  { return set; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P16_Remove_Block]^^55^56^57^^^54^59^if  ( set instanceof Unmodifiable )  { return set; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P8_Replace_Mix]^return null;^56^^^^^54^59^return set;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P13_Insert_Block]^if  ( set instanceof Unmodifiable )  {     return set; }^58^^^^^54^59^[Delete]^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P5_Replace_Variable]^return new UnmodifiableEntrySet<K, V> ( 4 ) ;^58^^^^^54^59^return new UnmodifiableEntrySet<K, V> ( set ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] unmodifiableEntrySet [RETURN_TYPE] <K,V>   Entry<K, V>> set [VARIABLES] long  serialVersionUID  Set  set  boolean  
[P8_Replace_Mix]^return ;^90^^^^^89^91^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] remove [RETURN_TYPE] boolean   Object object [VARIABLES] long  serialVersionUID  Object  object  boolean  
[P8_Replace_Mix]^return ;^95^^^^^94^96^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] removeAll [RETURN_TYPE] boolean   Collection<?> coll [VARIABLES] Collection  coll  long  serialVersionUID  boolean  
[P7_Replace_Invocation]^return new UnmodifiableEntrySetIterator ( decorated (  ) .next (  )  ) ;^106^^^^^105^107^return new UnmodifiableEntrySetIterator ( decorated (  ) .iterator (  )  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^106^107^^^^105^107^return new UnmodifiableEntrySetIterator ( decorated (  ) .iterator (  )  ) ; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] iterator [RETURN_TYPE] Iterator   [VARIABLES] long  serialVersionUID  boolean  
[P7_Replace_Invocation]^final Object[] array = decorated (  ) .iterator (  ) ;^112^^^^^111^117^final Object[] array = decorated (  ) .toArray (  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P7_Replace_Invocation]^final Object[] array = decorated (  )  .toArray (  )  ;^112^^^^^111^117^final Object[] array = decorated (  ) .toArray (  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P14_Delete_Statement]^^112^^^^^111^117^final Object[] array = decorated (  ) .toArray (  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P11_Insert_Donor_Statement]^result = decorated (  ) .toArray ( result ) ;final Object[] array = decorated (  ) .toArray (  ) ;^112^^^^^111^117^final Object[] array = decorated (  ) .toArray (  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P1_Replace_Type]^for  (  long  i = 0; i < array.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P2_Replace_Operator]^for  ( int i = 0; i <= array.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P3_Replace_Literal]^for  ( int i = -9; i < array.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P5_Replace_Variable]^for  ( arraynt i = 0; i < i.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P5_Replace_Variable]^for  ( int i = 0; i < array.length.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P5_Replace_Variable]^for  ( array.lengthnt i = 0; i < i; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P4_Replace_Constructor]^array[i] = array[i] =  new UnmodifiableEntry (  (  ( Entry<K, V> )   ( result[i] )  )  )   array[i] ) ;^114^^^^^111^117^array[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  array[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P8_Replace_Mix]^array[i] =  new UnmodifiableEntry (  (  ( Entry<K, V> )   ( result[i] )  )  )   array[i] ) ;^114^^^^^111^117^array[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  array[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P11_Insert_Donor_Statement]^result[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  result[i] ) ;array[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  array[i] ) ;^114^^^^^111^117^array[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  array[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P3_Replace_Literal]^for  ( int i = -7; i < array.length; i++ )  {^113^^^^^111^117^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] Object[]   [VARIABLES] boolean  long  serialVersionUID  Object[]  array  int  i  
[P2_Replace_Operator]^if  ( array.length == 0 )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^if  ( array.length > -1 )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^if  ( array.length > i )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( array.length.length > 0 )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( array > 0 )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^if  ( array.length > 0  )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P9_Replace_Statement]^if  ( array.length > result.length )  {^123^^^^^121^144^if  ( array.length > 0 )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P15_Unwrap_Block]^result = ((java.lang.Object[]) (java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), 0)));^123^124^^126^127^121^144^if  ( array.length > 0 )  {  result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P16_Remove_Block]^^123^124^^126^127^121^144^if  ( array.length > 0 )  {  result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) ,  ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 % 4 ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , -2 ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P14_Delete_Statement]^^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , i ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0L ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , -1 ) ;^126^^^^^121^144^result =  ( Object[] )  Array.newInstance ( array.getClass (  ) .getComponentType (  ) , 0 ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^result =  decorated (  ) .toArray ( null ) ;^128^^^^^121^144^result = decorated (  ) .toArray ( result ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P14_Delete_Statement]^^128^^^^^121^144^result = decorated (  ) .toArray ( result ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P11_Insert_Donor_Statement]^final Object[] array = decorated (  ) .toArray (  ) ;result = decorated (  ) .toArray ( result ) ;^128^^^^^121^144^result = decorated (  ) .toArray ( result ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P1_Replace_Type]^for  (  short  i = 0; i < result.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P2_Replace_Operator]^for  ( int i = 0; i <= result.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^for  ( int i = -3; i < result.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^for  ( result.lengthnt i = 0; i < i; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^for  ( int i = 0; i < result.length.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P4_Replace_Constructor]^result[i] = result[i] =  new UnmodifiableEntry (  (  ( Entry<K, V> )   ( array[i] )  )  )   result[i] ) ;^130^^^^^121^144^result[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  result[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^result[i] =  new UnmodifiableEntry (  (  ( Entry<K, V> )   ( array[i] )  )  )   result[i] ) ;^130^^^^^121^144^result[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  result[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P11_Insert_Donor_Statement]^array[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  array[i] ) ;result[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  result[i] ) ;^130^^^^^121^144^result[i] = new UnmodifiableEntry (  ( Map.Entry<K, V> )  result[i] ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P1_Replace_Type]^for  (  long  i = 0; i < result.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^for  ( int i = i; i < result.length; i++ )  {^129^^^^^121^144^for  ( int i = 0; i < result.length; i++ )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P2_Replace_Operator]^if  ( result.length >= array.length )  {^134^^^^^121^144^if  ( result.length > array.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( i > array.length )  {^134^^^^^121^144^if  ( result.length > array.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( result.length > i )  {^134^^^^^121^144^if  ( result.length > array.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( array.length > result.length )  {^134^^^^^121^144^if  ( result.length > array.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( result > array.length )  {^134^^^^^121^144^if  ( result.length > array.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P15_Unwrap_Block]^return ((T[]) (result));^134^135^136^^^121^144^if  ( result.length > array.length )  { return  ( T[] )  result; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P16_Remove_Block]^^134^135^136^^^121^144^if  ( result.length > array.length )  { return  ( T[] )  result; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P13_Insert_Block]^if  (  ( array.length )  >  ( result.length )  )  {     array[result.length] = null; }^134^^^^^121^144^[Delete]^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^System.arraycopy ( result, -9, array, -9, result.length ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P3_Replace_Literal]^System.arraycopy ( result, 4, array, 4, result.length ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy ( result, 0, array, 0, i ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy (  0, array, 0, result.length ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy ( result, 0,  0, result.length ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy ( result, 0, array, 0 ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy ( result.length, 0, array, 0, result ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^System.arraycopy ( result, 0, result.length, 0, array ) ;^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P14_Delete_Statement]^^139^^^^^121^144^System.arraycopy ( result, 0, array, 0, result.length ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P2_Replace_Operator]^if  ( array.length == result.length )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( i > result.length )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( array.length > i )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( result.length > array.length )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P5_Replace_Variable]^if  ( array > result.length )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P9_Replace_Statement]^if  ( array.length > 0 )  {^140^^^^^121^144^if  ( array.length > result.length )  {^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P15_Unwrap_Block]^array[result.length] = null;^140^141^142^^^121^144^if  ( array.length > result.length )  { array[result.length] = null; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P16_Remove_Block]^^140^141^142^^^121^144^if  ( array.length > result.length )  { array[result.length] = null; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P13_Insert_Block]^if  (  ( result.length )  >  ( array.length )  )  {     return  (  ( T[] )   ( result )  ) ; }^140^^^^^121^144^[Delete]^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^array[result.length] = this;^141^^^^^121^144^array[result.length] = null;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P8_Replace_Mix]^array[result.length] = true;^141^^^^^121^144^array[result.length] = null;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] toArray [RETURN_TYPE] <T>   final T[] array [VARIABLES] boolean  long  serialVersionUID  Object[]  result  int  i  T[]  array  
[P7_Replace_Invocation]^return new UnmodifiableEntry ( getIterator (  ) .iterator (  )  ) ;^158^^^^^157^159^return new UnmodifiableEntry ( getIterator (  ) .next (  )  ) ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] next [RETURN_TYPE] Map$Entry   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^158^159^^^^157^159^return new UnmodifiableEntry ( getIterator (  ) .next (  )  ) ; }^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] next [RETURN_TYPE] Map$Entry   [VARIABLES] long  serialVersionUID  boolean  
[P8_Replace_Mix]^return ;^163^^^^^162^164^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] long  serialVersionUID  boolean  
[P8_Replace_Mix]^return 0;^179^^^^^178^180^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableEntrySet UnmodifiableEntrySetIterator UnmodifiableEntry  [METHOD] setValue [RETURN_TYPE] V   final V obj [VARIABLES] long  serialVersionUID  V  obj  boolean  
[P14_Delete_Statement]^^153^^^^^152^154^super ( iterator ) ;^[CLASS] UnmodifiableEntrySetIterator  [METHOD] <init> [RETURN_TYPE] Iterator)   Entry<K, V>> iterator [VARIABLES] boolean  Iterator  iterator  
[P7_Replace_Invocation]^return new UnmodifiableEntry ( getIterator (  )  .next (  )   ) ;^158^^^^^157^159^return new UnmodifiableEntry ( getIterator (  ) .next (  )  ) ;^[CLASS] UnmodifiableEntrySetIterator  [METHOD] next [RETURN_TYPE] Map$Entry   [VARIABLES] boolean  
[P14_Delete_Statement]^^158^159^^^^157^159^return new UnmodifiableEntry ( getIterator (  ) .next (  )  ) ; }^[CLASS] UnmodifiableEntrySetIterator  [METHOD] next [RETURN_TYPE] Map$Entry   [VARIABLES] boolean  
[P8_Replace_Mix]^return ;^163^^^^^162^164^throw new UnsupportedOperationException  (" ")  ;^[CLASS] UnmodifiableEntrySetIterator  [METHOD] remove [RETURN_TYPE] void   [VARIABLES] boolean  
[P14_Delete_Statement]^^174^^^^^173^175^super ( entry ) ;^[CLASS] UnmodifiableEntry  [METHOD] <init> [RETURN_TYPE] Map$Entry)   Entry<K, V> entry [VARIABLES] Entry  entry  boolean  
