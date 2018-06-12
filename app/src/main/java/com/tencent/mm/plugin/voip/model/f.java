package com.tencent.mm.plugin.voip.model;

import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class f
{
  public int oJe = 0;
  
  private static void a(h paramh)
  {
    int j = paramh.bJE();
    paramh.yp(4);
    paramh.yp(4);
    int i = 0;
    while (i <= j)
    {
      paramh.bJF();
      paramh.bJF();
      paramh.yp(1);
      i += 1;
    }
    paramh.yp(5);
    paramh.yp(5);
    paramh.yp(5);
    paramh.yp(5);
  }
  
  public static byte[] v(InputStream paramInputStream)
  {
    int j = 0;
    Object localObject = new ByteArrayOutputStream();
    paramInputStream = new h(paramInputStream, (OutputStream)localObject);
    paramInputStream.yq(8);
    paramInputStream.yq(8);
    paramInputStream.yq(8);
    paramInputStream.yq(8);
    paramInputStream.yq(8);
    int i = (int)paramInputStream.bJC();
    paramInputStream.yq(8);
    paramInputStream.bJC();
    paramInputStream.bJF();
    if ((i == 100) || (i == 110) || (i == 122) || (i == 144))
    {
      if (paramInputStream.bJE() == 3) {
        paramInputStream.yq(1);
      }
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.yq(1);
      if (paramInputStream.iL(true))
      {
        i = 0;
        if (i < 8)
        {
          if (paramInputStream.iL(true))
          {
            if (i >= 6) {
              break label167;
            }
            paramInputStream.yr(16);
          }
          for (;;)
          {
            i += 1;
            break;
            label167:
            paramInputStream.yr(64);
          }
        }
      }
    }
    paramInputStream.bJF();
    i = paramInputStream.bJE();
    if (i == 0)
    {
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.yq(1);
      paramInputStream.bJF();
      paramInputStream.bJF();
      if (!paramInputStream.iL(true)) {
        paramInputStream.yq(1);
      }
      paramInputStream.yq(1);
      if (paramInputStream.iL(true))
      {
        paramInputStream.bJF();
        paramInputStream.bJF();
        paramInputStream.bJF();
        paramInputStream.bJF();
      }
      if (!paramInputStream.iL(false)) {
        break label733;
      }
      x.d("[H264SPSModifier]", "vui_parameters_present_flag exist!! modify max_dec_frame_buffering");
      paramInputStream.iN(true);
      if ((paramInputStream.iL(true)) && ((int)paramInputStream.bJC() == 255))
      {
        paramInputStream.yq(16);
        paramInputStream.yq(16);
      }
      if (paramInputStream.iL(true)) {
        paramInputStream.yq(1);
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.yq(3);
        paramInputStream.yq(1);
        if (paramInputStream.iL(true))
        {
          paramInputStream.yq(8);
          paramInputStream.yq(8);
          paramInputStream.yq(8);
        }
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.bJF();
        paramInputStream.bJF();
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.yq(32);
        paramInputStream.yq(32);
        paramInputStream.yq(1);
      }
      boolean bool1 = paramInputStream.iL(true);
      if (bool1) {
        a(paramInputStream);
      }
      boolean bool2 = paramInputStream.iL(true);
      if (bool2) {
        a(paramInputStream);
      }
      if ((bool1) || (bool2)) {
        paramInputStream.yq(1);
      }
      paramInputStream.yq(1);
      if (!paramInputStream.iL(false)) {
        break label681;
      }
      x.d("TAG", "steve:VUI has bs restriction!!");
      paramInputStream.iN(true);
      paramInputStream.iL(true);
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.yt(1);
    }
    byte[] arrayOfByte;
    for (;;)
    {
      paramInputStream.ys(1);
      paramInputStream.A(0L, 8 - paramInputStream.oJn);
      paramInputStream.flush();
      arrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
      paramInputStream = "";
      i = j;
      while (i < arrayOfByte.length)
      {
        String str = Integer.toHexString(arrayOfByte[i] & 0xFF);
        localObject = str;
        if (str.length() == 1) {
          localObject = "0" + str;
        }
        paramInputStream = paramInputStream + " " + (String)localObject;
        i += 1;
      }
      if (i != 1) {
        break;
      }
      paramInputStream.yq(1);
      paramInputStream.bJF();
      paramInputStream.bJF();
      int k = paramInputStream.bJE();
      i = 0;
      while (i < k)
      {
        new StringBuilder("SPS: offsetForRefFrame [").append(i).append("]");
        paramInputStream.bJF();
        i += 1;
      }
      break;
      label681:
      x.d("TAG", "steve:VUI has NO bs restriction!!");
      paramInputStream.iN(true);
      paramInputStream.iN(true);
      paramInputStream.yt(0);
      paramInputStream.yt(0);
      paramInputStream.yt(10);
      paramInputStream.yt(10);
      paramInputStream.yt(0);
      paramInputStream.yt(1);
      continue;
      label733:
      x.d("[H264SPSModifier]", "vui_parameters_present_flag NOT exist!! add max_dec_frame_buffering");
      paramInputStream.iN(true);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(false);
      paramInputStream.iN(true);
      paramInputStream.iN(true);
      paramInputStream.yt(0);
      paramInputStream.yt(0);
      paramInputStream.yt(10);
      paramInputStream.yt(10);
      paramInputStream.yt(0);
      paramInputStream.yt(1);
    }
    x.d("TAG", "new SPS:" + paramInputStream);
    return arrayOfByte;
  }
  
  public final boolean w(InputStream paramInputStream)
  {
    paramInputStream = new h(paramInputStream);
    paramInputStream.yp(8);
    paramInputStream.yp(8);
    paramInputStream.yp(8);
    paramInputStream.yp(8);
    paramInputStream.yp(8);
    int i = (int)paramInputStream.bJC();
    if (i == 66)
    {
      this.oJe |= 0x1;
      return false;
    }
    paramInputStream.yp(8);
    paramInputStream.bJC();
    paramInputStream.bJF();
    if ((i == 100) || (i == 110) || (i == 122) || (i == 144))
    {
      if (paramInputStream.bJE() == 3) {
        paramInputStream.yp(1);
      }
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.yp(1);
      if (paramInputStream.iL(true))
      {
        i = 0;
        if (i < 8)
        {
          if (paramInputStream.iL(true))
          {
            if (i >= 6) {
              break label172;
            }
            paramInputStream.yr(16);
          }
          for (;;)
          {
            i += 1;
            break;
            label172:
            paramInputStream.yr(64);
          }
        }
      }
    }
    paramInputStream.bJF();
    i = paramInputStream.bJE();
    if (i == 0) {
      paramInputStream.bJF();
    }
    for (;;)
    {
      if (paramInputStream.bJE() >= 2) {
        this.oJe |= 0x2;
      }
      paramInputStream.yq(1);
      paramInputStream.bJF();
      paramInputStream.bJF();
      if (!paramInputStream.iL(true)) {
        paramInputStream.yq(1);
      }
      paramInputStream.yq(1);
      if (paramInputStream.iL(true))
      {
        paramInputStream.bJF();
        paramInputStream.bJF();
        paramInputStream.bJF();
        paramInputStream.bJF();
      }
      if (!paramInputStream.iL(true)) {
        break;
      }
      x.d("[H264SPSModifier]", "vui_parameters_present_flag exist!! read num_reorder_frames");
      if ((paramInputStream.iL(true)) && ((int)paramInputStream.bJC() == 255))
      {
        paramInputStream.yq(16);
        paramInputStream.yq(16);
      }
      if (paramInputStream.iL(true)) {
        paramInputStream.yq(1);
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.yq(3);
        paramInputStream.yq(1);
        if (paramInputStream.iL(true))
        {
          paramInputStream.yq(8);
          paramInputStream.yq(8);
          paramInputStream.yq(8);
        }
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.bJF();
        paramInputStream.bJF();
      }
      if (paramInputStream.iL(true))
      {
        paramInputStream.yq(32);
        paramInputStream.yq(32);
        paramInputStream.yq(1);
      }
      boolean bool1 = paramInputStream.iL(true);
      if (bool1) {
        a(paramInputStream);
      }
      boolean bool2 = paramInputStream.iL(true);
      if (bool2) {
        a(paramInputStream);
      }
      if ((bool1) || (bool2)) {
        paramInputStream.yq(1);
      }
      paramInputStream.yq(1);
      if (!paramInputStream.iL(true)) {
        break;
      }
      paramInputStream.iL(true);
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.bJF();
      paramInputStream.bJF();
      i = paramInputStream.bJE();
      int j = paramInputStream.bJE();
      if (i == 0) {
        break;
      }
      x.d("[H264SPSModifier]", "steve: reorder_frame =" + i + ", mac_dec_buffering=" + j);
      this.oJe |= 0x4;
      return true;
      if (i == 1)
      {
        paramInputStream.yp(1);
        paramInputStream.bJF();
        paramInputStream.bJF();
        j = paramInputStream.bJE();
        i = 0;
        while (i < j)
        {
          new StringBuilder("SPS: offsetForRefFrame [").append(i).append("]");
          paramInputStream.bJF();
          i += 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/voip/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */