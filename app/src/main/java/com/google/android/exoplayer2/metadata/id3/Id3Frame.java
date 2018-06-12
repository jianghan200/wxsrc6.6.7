package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class Id3Frame
  implements Metadata.Entry
{
  public final String id;
  
  public Id3Frame(String paramString)
  {
    this.id = ((String)a.Z(paramString));
  }
  
  public int describeContents()
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/Id3Frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */