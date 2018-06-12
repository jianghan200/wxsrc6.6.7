package com.google.a.a;

import java.io.IOException;

public final class d
  extends IOException
{
  private d(String paramString)
  {
    super(paramString);
  }
  
  static d sd()
  {
    return new d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static d se()
  {
    return new d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static d sf()
  {
    return new d("CodedInputStream encountered a malformed varint.");
  }
  
  static d sg()
  {
    return new d("Protocol message contained an invalid tag (zero).");
  }
  
  static d sh()
  {
    return new d("Protocol message end-group tag did not match expected tag.");
  }
  
  static d si()
  {
    return new d("Protocol message tag had invalid wire type.");
  }
  
  static d sj()
  {
    return new d("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */