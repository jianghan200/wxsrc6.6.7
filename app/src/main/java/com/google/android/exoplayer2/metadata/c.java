package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;

public abstract interface c
{
  public static final c aqr = new c()
  {
    public final boolean g(Format paramAnonymousFormat)
    {
      paramAnonymousFormat = paramAnonymousFormat.adW;
      return ("application/id3".equals(paramAnonymousFormat)) || ("application/x-emsg".equals(paramAnonymousFormat)) || ("application/x-scte35".equals(paramAnonymousFormat));
    }
    
    public final a h(Format paramAnonymousFormat)
    {
      paramAnonymousFormat = paramAnonymousFormat.adW;
      int i = -1;
      switch (paramAnonymousFormat.hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
          if (paramAnonymousFormat.equals("application/id3"))
          {
            i = 0;
            continue;
            if (paramAnonymousFormat.equals("application/x-emsg"))
            {
              i = 1;
              continue;
              if (paramAnonymousFormat.equals("application/x-scte35")) {
                i = 2;
              }
            }
          }
          break;
        }
      }
      return new com.google.android.exoplayer2.metadata.id3.a();
      return new com.google.android.exoplayer2.metadata.emsg.a();
      return new com.google.android.exoplayer2.metadata.scte35.a();
    }
  };
  
  public abstract boolean g(Format paramFormat);
  
  public abstract a h(Format paramFormat);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/metadata/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */