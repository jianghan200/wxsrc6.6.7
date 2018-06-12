package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.t;

public final class CommentFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<CommentFrame> CREATOR = new CommentFrame.1();
  public final String aem;
  public final String description;
  public final String text;
  
  CommentFrame(Parcel paramParcel)
  {
    super("COMM");
    this.aem = paramParcel.readString();
    this.description = paramParcel.readString();
    this.text = paramParcel.readString();
  }
  
  public CommentFrame(String paramString1, String paramString2, String paramString3)
  {
    super("COMM");
    this.aem = paramString1;
    this.description = paramString2;
    this.text = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (CommentFrame)paramObject;
    } while ((t.i(this.description, ((CommentFrame)paramObject).description)) && (t.i(this.aem, ((CommentFrame)paramObject).aem)) && (t.i(this.text, ((CommentFrame)paramObject).text)));
    return false;
  }
  
  public final int hashCode()
  {
    int k = 0;
    int i;
    if (this.aem != null)
    {
      i = this.aem.hashCode();
      if (this.description == null) {
        break label68;
      }
    }
    label68:
    for (int j = this.description.hashCode();; j = 0)
    {
      if (this.text != null) {
        k = this.text.hashCode();
      }
      return (j + (i + 527) * 31) * 31 + k;
      i = 0;
      break;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.aem);
    paramParcel.writeString(this.text);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/CommentFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */