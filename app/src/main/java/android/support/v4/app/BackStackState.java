package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator() {};
  final int mF;
  final int mG;
  final int mIndex;
  final int mK;
  final CharSequence mL;
  final int mM;
  final CharSequence mN;
  final String mName;
  final ArrayList<String> mO;
  final ArrayList<String> mP;
  final int[] nn;
  
  public BackStackState(Parcel paramParcel)
  {
    this.nn = paramParcel.createIntArray();
    this.mF = paramParcel.readInt();
    this.mG = paramParcel.readInt();
    this.mName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    this.mK = paramParcel.readInt();
    this.mL = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.mM = paramParcel.readInt();
    this.mN = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.mO = paramParcel.createStringArrayList();
    this.mP = paramParcel.createStringArrayList();
  }
  
  public BackStackState(e parame)
  {
    e.a locala = parame.my;
    int j;
    for (int i = 0; locala != null; i = j)
    {
      j = i;
      if (locala.ni != null) {
        j = i + locala.ni.size();
      }
      locala = locala.na;
    }
    this.nn = new int[i + parame.mA * 7];
    if (!parame.mH) {
      throw new IllegalStateException("Not on back stack");
    }
    locala = parame.my;
    i = 0;
    if (locala != null)
    {
      int[] arrayOfInt = this.nn;
      j = i + 1;
      arrayOfInt[i] = locala.nc;
      arrayOfInt = this.nn;
      int k = j + 1;
      if (locala.nd != null) {}
      for (i = locala.nd.mIndex;; i = -1)
      {
        arrayOfInt[j] = i;
        arrayOfInt = this.nn;
        i = k + 1;
        arrayOfInt[k] = locala.ne;
        arrayOfInt = this.nn;
        j = i + 1;
        arrayOfInt[i] = locala.nf;
        arrayOfInt = this.nn;
        i = j + 1;
        arrayOfInt[j] = locala.ng;
        arrayOfInt = this.nn;
        j = i + 1;
        arrayOfInt[i] = locala.nh;
        if (locala.ni == null) {
          break label314;
        }
        k = locala.ni.size();
        arrayOfInt = this.nn;
        i = j + 1;
        arrayOfInt[j] = k;
        j = 0;
        while (j < k)
        {
          this.nn[i] = ((Fragment)locala.ni.get(j)).mIndex;
          j += 1;
          i += 1;
        }
      }
      for (;;)
      {
        locala = locala.na;
        break;
        label314:
        arrayOfInt = this.nn;
        i = j + 1;
        arrayOfInt[j] = 0;
      }
    }
    this.mF = parame.mF;
    this.mG = parame.mG;
    this.mName = parame.mName;
    this.mIndex = parame.mIndex;
    this.mK = parame.mK;
    this.mL = parame.mL;
    this.mM = parame.mM;
    this.mN = parame.mN;
    this.mO = parame.mO;
    this.mP = parame.mP;
  }
  
  public final e a(n paramn)
  {
    e locale = new e(paramn);
    int k = 0;
    int i = 0;
    while (i < this.nn.length)
    {
      e.a locala = new e.a();
      Object localObject = this.nn;
      int j = i + 1;
      locala.nc = localObject[i];
      if (n.DEBUG) {
        new StringBuilder("Instantiate ").append(locale).append(" op #").append(k).append(" base fragment #").append(this.nn[j]);
      }
      localObject = this.nn;
      i = j + 1;
      j = localObject[j];
      if (j >= 0) {}
      for (locala.nd = ((Fragment)paramn.nK.get(j));; locala.nd = null)
      {
        localObject = this.nn;
        j = i + 1;
        locala.ne = localObject[i];
        localObject = this.nn;
        i = j + 1;
        locala.nf = localObject[j];
        localObject = this.nn;
        j = i + 1;
        locala.ng = localObject[i];
        localObject = this.nn;
        i = j + 1;
        locala.nh = localObject[j];
        localObject = this.nn;
        j = i + 1;
        int n = localObject[i];
        i = j;
        if (n <= 0) {
          break;
        }
        locala.ni = new ArrayList(n);
        int m = 0;
        for (;;)
        {
          i = j;
          if (m >= n) {
            break;
          }
          if (n.DEBUG) {
            new StringBuilder("Instantiate ").append(locale).append(" set remove fragment #").append(this.nn[j]);
          }
          localObject = (Fragment)paramn.nK.get(this.nn[j]);
          locala.ni.add(localObject);
          m += 1;
          j += 1;
        }
      }
      locale.mB = locala.ne;
      locale.mC = locala.nf;
      locale.mD = locala.ng;
      locale.mE = locala.nh;
      locale.a(locala);
      k += 1;
    }
    locale.mF = this.mF;
    locale.mG = this.mG;
    locale.mName = this.mName;
    locale.mIndex = this.mIndex;
    locale.mH = true;
    locale.mK = this.mK;
    locale.mL = this.mL;
    locale.mM = this.mM;
    locale.mN = this.mN;
    locale.mO = this.mO;
    locale.mP = this.mP;
    locale.Q(1);
    return locale;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.nn);
    paramParcel.writeInt(this.mF);
    paramParcel.writeInt(this.mG);
    paramParcel.writeString(this.mName);
    paramParcel.writeInt(this.mIndex);
    paramParcel.writeInt(this.mK);
    TextUtils.writeToParcel(this.mL, paramParcel, 0);
    paramParcel.writeInt(this.mM);
    TextUtils.writeToParcel(this.mN, paramParcel, 0);
    paramParcel.writeStringList(this.mO);
    paramParcel.writeStringList(this.mP);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/BackStackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */