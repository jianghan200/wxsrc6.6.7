package com.google.android.exoplayer2.f.f;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.f.d;
import com.google.android.exoplayer2.f.f;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;
import java.nio.charset.Charset;
import java.util.List;

public final class a
  extends com.google.android.exoplayer2.f.b
{
  private static final int azi = t.aE("styl");
  private static final int azj = t.aE("tbox");
  private final j azk = new j();
  private boolean azl;
  private int azm;
  private int azn;
  private String azo;
  private float azp;
  private int azq;
  
  public a(List<byte[]> paramList)
  {
    super("Tx3gDecoder");
    if ((paramList != null) && (paramList.size() == 1) && ((((byte[])paramList.get(0)).length == 48) || (((byte[])paramList.get(0)).length == 53)))
    {
      byte[] arrayOfByte = (byte[])paramList.get(0);
      this.azm = arrayOfByte[24];
      this.azn = ((arrayOfByte[26] & 0xFF) << 24 | (arrayOfByte[27] & 0xFF) << 16 | (arrayOfByte[28] & 0xFF) << 8 | arrayOfByte[29] & 0xFF);
      if ("Serif".equals(new String(arrayOfByte, 43, arrayOfByte.length - 43)))
      {
        paramList = "serif";
        this.azo = paramList;
        this.azq = (arrayOfByte[25] * 20);
        if ((arrayOfByte[0] & 0x20) == 0) {
          break label261;
        }
      }
      label261:
      for (boolean bool = true;; bool = false)
      {
        this.azl = bool;
        if (!this.azl) {
          break label266;
        }
        int i = arrayOfByte[10];
        this.azp = ((arrayOfByte[11] & 0xFF | (i & 0xFF) << 8) / this.azq);
        this.azp = t.g(this.azp, 0.0F, 0.95F);
        return;
        paramList = "sans-serif";
        break;
      }
      label266:
      this.azp = 0.85F;
      return;
    }
    this.azm = 0;
    this.azn = -1;
    this.azo = "sans-serif";
    this.azl = false;
    this.azp = 0.85F;
  }
  
  private static void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 1;
    int j;
    if (paramInt1 != paramInt2)
    {
      j = paramInt5 | 0x21;
      if ((paramInt1 & 0x1) == 0) {
        break label118;
      }
      paramInt2 = 1;
      if ((paramInt1 & 0x2) == 0) {
        break label123;
      }
      paramInt5 = 1;
      label32:
      if (paramInt2 == 0) {
        break label149;
      }
      if (paramInt5 == 0) {
        break label129;
      }
      paramSpannableStringBuilder.setSpan(new StyleSpan(3), paramInt3, paramInt4, j);
      label58:
      if ((paramInt1 & 0x4) == 0) {
        break label174;
      }
    }
    label118:
    label123:
    label129:
    label149:
    label174:
    for (paramInt1 = i;; paramInt1 = 0)
    {
      if (paramInt1 != 0) {
        paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt3, paramInt4, j);
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt5 == 0)) {
        paramSpannableStringBuilder.setSpan(new StyleSpan(0), paramInt3, paramInt4, j);
      }
      return;
      paramInt2 = 0;
      break;
      paramInt5 = 0;
      break label32;
      paramSpannableStringBuilder.setSpan(new StyleSpan(1), paramInt3, paramInt4, j);
      break label58;
      if (paramInt5 == 0) {
        break label58;
      }
      paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt3, paramInt4, j);
      break label58;
    }
  }
  
  private static void assertTrue(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new f("Unexpected subtitle format.");
    }
  }
  
  private static void b(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 != paramInt2) {
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan((paramInt1 & 0xFF) << 24 | paramInt1 >>> 8), paramInt3, paramInt4, paramInt5 | 0x21);
    }
  }
  
  protected final d b(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    this.azk.m(paramArrayOfByte, paramInt);
    paramArrayOfByte = this.azk;
    if (paramArrayOfByte.me() >= 2)
    {
      paramBoolean = true;
      assertTrue(paramBoolean);
      paramInt = paramArrayOfByte.readUnsignedShort();
      if (paramInt != 0) {
        break label56;
      }
      paramArrayOfByte = "";
    }
    label56:
    int i;
    for (;;)
    {
      if (!paramArrayOfByte.isEmpty()) {
        break label141;
      }
      return b.azr;
      paramBoolean = false;
      break;
      if (paramArrayOfByte.me() >= 2)
      {
        i = (char)((paramArrayOfByte.data[paramArrayOfByte.position] & 0xFF) << 8 | paramArrayOfByte.data[(paramArrayOfByte.position + 1)] & 0xFF);
        if ((i == 65279) || (i == 65534))
        {
          paramArrayOfByte = paramArrayOfByte.a(paramInt, Charset.forName("UTF-16"));
          continue;
        }
      }
      paramArrayOfByte = paramArrayOfByte.a(paramInt, Charset.forName("UTF-8"));
    }
    label141:
    paramArrayOfByte = new SpannableStringBuilder(paramArrayOfByte);
    a(paramArrayOfByte, this.azm, 0, 0, paramArrayOfByte.length(), 16711680);
    b(paramArrayOfByte, this.azn, -1, 0, paramArrayOfByte.length(), 16711680);
    Object localObject = this.azo;
    paramInt = paramArrayOfByte.length();
    if (localObject != "sans-serif") {
      paramArrayOfByte.setSpan(new TypefaceSpan((String)localObject), 0, paramInt, 16711713);
    }
    float f = this.azp;
    int j;
    if (this.azk.me() >= 8)
    {
      i = this.azk.position;
      j = this.azk.readInt();
      paramInt = this.azk.readInt();
      if (paramInt == azi)
      {
        if (this.azk.me() >= 2)
        {
          paramBoolean = true;
          assertTrue(paramBoolean);
          int k = this.azk.readUnsignedShort();
          paramInt = 0;
          label296:
          if (paramInt >= k) {
            break label411;
          }
          localObject = this.azk;
          if (((j)localObject).me() < 12) {
            break label406;
          }
        }
        label406:
        for (paramBoolean = true;; paramBoolean = false)
        {
          assertTrue(paramBoolean);
          int m = ((j)localObject).readUnsignedShort();
          int n = ((j)localObject).readUnsignedShort();
          ((j)localObject).da(2);
          int i1 = ((j)localObject).readUnsignedByte();
          ((j)localObject).da(1);
          int i2 = ((j)localObject).readInt();
          a(paramArrayOfByte, i1, this.azm, m, n, 0);
          b(paramArrayOfByte, i2, this.azn, m, n, 0);
          paramInt += 1;
          break label296;
          paramBoolean = false;
          break;
        }
      }
    }
    for (;;)
    {
      label411:
      this.azk.setPosition(i + j);
      break;
      if ((paramInt == azj) && (this.azl))
      {
        if (this.azk.me() >= 2) {}
        for (paramBoolean = true;; paramBoolean = false)
        {
          assertTrue(paramBoolean);
          f = t.g(this.azk.readUnsignedShort() / this.azq, 0.0F, 0.95F);
          break;
        }
        return new b(new com.google.android.exoplayer2.f.a(paramArrayOfByte, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/f/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */