package LibraryApp;

/**
* LibraryApp/LibraryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Library.idl
* Friday, March 8, 2019 7:16:00 o'clock PM EST
*/

public final class LibraryHolder implements org.omg.CORBA.portable.Streamable
{
  public LibraryApp.Library value = null;

  public LibraryHolder ()
  {
  }

  public LibraryHolder (LibraryApp.Library initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = LibraryApp.LibraryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    LibraryApp.LibraryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return LibraryApp.LibraryHelper.type ();
  }

}
