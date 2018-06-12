package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator() {};
  private final Bundle mExtras;
  private final String sm;
  private final CharSequence sn;
  private final CharSequence so;
  private final CharSequence sp;
  private final Bitmap sq;
  private final Uri sr;
  private final Uri ss;
  private Object st;
  
  private MediaDescriptionCompat(Parcel paramParcel)
  {
    this.sm = paramParcel.readString();
    this.sn = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.so = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.sp = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.sq = ((Bitmap)paramParcel.readParcelable(null));
    this.sr = ((Uri)paramParcel.readParcelable(null));
    this.mExtras = paramParcel.readBundle();
    this.ss = ((Uri)paramParcel.readParcelable(null));
  }
  
  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.sm = paramString;
    this.sn = paramCharSequence1;
    this.so = paramCharSequence2;
    this.sp = paramCharSequence3;
    this.sq = paramBitmap;
    this.sr = paramUri1;
    this.mExtras = paramBundle;
    this.ss = paramUri2;
  }
  
  public static MediaDescriptionCompat g(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    a locala = new a();
    locala.sm = ((MediaDescription)paramObject).getMediaId();
    locala.sn = ((MediaDescription)paramObject).getTitle();
    locala.so = ((MediaDescription)paramObject).getSubtitle();
    locala.sp = ((MediaDescription)paramObject).getDescription();
    locala.sq = ((MediaDescription)paramObject).getIconBitmap();
    locala.sr = ((MediaDescription)paramObject).getIconUri();
    Bundle localBundle = ((MediaDescription)paramObject).getExtras();
    Object localObject;
    if (localBundle == null)
    {
      localObject = null;
      if (localObject == null) {
        break label212;
      }
      if ((!localBundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle.size() != 2)) {
        break label200;
      }
      localBundle = null;
      label125:
      locala.mExtras = localBundle;
      if (localObject == null) {
        break label215;
      }
      locala.ss = ((Uri)localObject);
    }
    for (;;)
    {
      localObject = new MediaDescriptionCompat(locala.sm, locala.sn, locala.so, locala.sp, locala.sq, locala.sr, locala.mExtras, locala.ss, (byte)0);
      ((MediaDescriptionCompat)localObject).st = paramObject;
      return (MediaDescriptionCompat)localObject;
      localObject = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      break;
      label200:
      localBundle.remove("android.support.v4.media.description.MEDIA_URI");
      localBundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
      label212:
      break label125;
      label215:
      if (Build.VERSION.SDK_INT >= 23) {
        locala.ss = ((MediaDescription)paramObject).getMediaUri();
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.sn + ", " + this.so + ", " + this.sp;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.sm);
      TextUtils.writeToParcel(this.sn, paramParcel, paramInt);
      TextUtils.writeToParcel(this.so, paramParcel, paramInt);
      TextUtils.writeToParcel(this.sp, paramParcel, paramInt);
      paramParcel.writeParcelable(this.sq, paramInt);
      paramParcel.writeParcelable(this.sr, paramInt);
      paramParcel.writeBundle(this.mExtras);
      paramParcel.writeParcelable(this.ss, paramInt);
      return;
    }
    if ((this.st != null) || (Build.VERSION.SDK_INT < 21))
    {
      localObject = this.st;
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
      return;
    }
    MediaDescription.Builder localBuilder = new MediaDescription.Builder();
    Object localObject = this.sm;
    ((MediaDescription.Builder)localBuilder).setMediaId((String)localObject);
    localObject = this.sn;
    ((MediaDescription.Builder)localBuilder).setTitle((CharSequence)localObject);
    localObject = this.so;
    ((MediaDescription.Builder)localBuilder).setSubtitle((CharSequence)localObject);
    localObject = this.sp;
    ((MediaDescription.Builder)localBuilder).setDescription((CharSequence)localObject);
    localObject = this.sq;
    ((MediaDescription.Builder)localBuilder).setIconBitmap((Bitmap)localObject);
    localObject = this.sr;
    ((MediaDescription.Builder)localBuilder).setIconUri((Uri)localObject);
    Bundle localBundle = this.mExtras;
    if ((Build.VERSION.SDK_INT < 23) && (this.ss != null))
    {
      localObject = localBundle;
      if (localBundle == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
      }
      ((Bundle)localObject).putParcelable("android.support.v4.media.description.MEDIA_URI", this.ss);
    }
    for (;;)
    {
      ((MediaDescription.Builder)localBuilder).setExtras((Bundle)localObject);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.ss;
        ((MediaDescription.Builder)localBuilder).setMediaUri((Uri)localObject);
      }
      this.st = ((MediaDescription.Builder)localBuilder).build();
      localObject = this.st;
      break;
      localObject = localBundle;
    }
  }
  
  public static final class a
  {
    Bundle mExtras;
    String sm;
    CharSequence sn;
    CharSequence so;
    CharSequence sp;
    Bitmap sq;
    Uri sr;
    Uri ss;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/media/MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */