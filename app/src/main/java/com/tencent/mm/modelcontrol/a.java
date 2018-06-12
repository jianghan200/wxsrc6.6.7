package com.tencent.mm.modelcontrol;

import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private static f[] dQu = null;
  
  static
  {
    f[] arrayOff = new f[2];
    dQu = arrayOff;
    arrayOff[0] = new f(0, 120, 540, 960, 30, 1200000, 1200000);
    dQu[1] = new f(120, 300, 360, 640, 24, 544000, 544000);
  }
  
  public static int a(f[] paramArrayOff, VideoTransPara paramVideoTransPara1, VideoTransPara paramVideoTransPara2)
  {
    f[] arrayOff;
    if (paramArrayOff != null) {
      arrayOff = paramArrayOff;
    }
    for (;;)
    {
      int k;
      int i1;
      int i2;
      try
      {
        if (paramArrayOff.length <= 0) {
          arrayOff = dQu;
        }
        n = arrayOff.length;
        paramVideoTransPara2.width = paramVideoTransPara1.width;
        paramVideoTransPara2.height = paramVideoTransPara1.height;
        paramVideoTransPara2.fps = paramVideoTransPara1.fps;
        paramVideoTransPara2.videoBitrate = paramVideoTransPara1.videoBitrate;
        paramVideoTransPara2.duration = paramVideoTransPara1.duration;
        if (paramVideoTransPara1.width <= paramVideoTransPara1.height) {
          break label934;
        }
        k = 1;
        if (k != 0)
        {
          i = paramVideoTransPara1.width;
          if (k != 0)
          {
            j = paramVideoTransPara1.height;
            i1 = paramVideoTransPara1.duration;
            if (paramVideoTransPara2.duration < arrayOff[(n - 1)].dQM) {
              break label878;
            }
            if (paramVideoTransPara2.duration >= dQu[1].dQM) {
              continue;
            }
            break label878;
            if (m >= n) {
              break label967;
            }
            if ((i1 < arrayOff[m].dQL) || (i1 >= arrayOff[m].dQM)) {
              break label958;
            }
            i1 = arrayOff[m].dQN;
            i2 = arrayOff[m].dQO;
            if (i > i1) {
              break label884;
            }
            if (j <= i2) {
              break label865;
            }
            break label884;
            if (n == 0) {
              continue;
            }
            i = j * i1 / i;
            j = i1;
            break label902;
            paramVideoTransPara2.width = n;
            if (k == 0) {
              break label952;
            }
            paramVideoTransPara2.height = i;
            if (paramVideoTransPara2.fps <= arrayOff[m].dQP) {
              continue;
            }
            i = arrayOff[m].dQP;
            paramVideoTransPara2.fps = i;
            paramVideoTransPara2.videoBitrate = ((int)((arrayOff[m].dQQ * arrayOff[m].dQM + arrayOff[m].dQR * paramVideoTransPara2.duration - arrayOff[m].dQQ * paramVideoTransPara2.duration - arrayOff[m].dQR * arrayOff[m].dQL) / (arrayOff[m].dQM - arrayOff[m].dQL) * Math.sqrt(1.0D * (paramVideoTransPara2.width * paramVideoTransPara2.height) / (arrayOff[m].dQN * arrayOff[m].dQO)) * paramVideoTransPara2.fps / arrayOff[m].dQP * (1.0D + (arrayOff[m].dQP - paramVideoTransPara2.fps) * 0.015D)));
            return paramVideoTransPara2.videoBitrate;
          }
        }
        else
        {
          i = paramVideoTransPara1.height;
          continue;
        }
        j = paramVideoTransPara1.width;
        continue;
        j = i * i2 / j;
        i = i2;
        break label902;
        i = paramVideoTransPara2.fps;
        continue;
        if (m < 2)
        {
          if ((i1 >= dQu[m].dQL) && (i1 < dQu[m].dQM))
          {
            i1 = dQu[m].dQN;
            i2 = dQu[m].dQO;
            if (i > i1) {
              break label973;
            }
            if (j > i2)
            {
              break label973;
              if (n != 0)
              {
                i = j * i1 / i;
                j = i1;
                break label991;
                paramVideoTransPara2.width = n;
                if (k == 0) {
                  break label1035;
                }
                paramVideoTransPara2.height = i;
                if (paramVideoTransPara2.fps > dQu[m].dQP)
                {
                  i = dQu[m].dQP;
                  paramVideoTransPara2.fps = i;
                  paramVideoTransPara2.videoBitrate = ((int)((dQu[m].dQQ * dQu[m].dQM + dQu[m].dQR * paramVideoTransPara2.duration - dQu[m].dQQ * paramVideoTransPara2.duration - dQu[m].dQR * dQu[m].dQL) / (dQu[m].dQM - dQu[m].dQL) * Math.sqrt(1.0D * (paramVideoTransPara2.width * paramVideoTransPara2.height) / (dQu[m].dQN * dQu[m].dQO)) * paramVideoTransPara2.fps / dQu[m].dQP * (1.0D + (dQu[m].dQP - paramVideoTransPara2.fps) * 0.015D)));
                  return paramVideoTransPara2.videoBitrate;
                }
              }
              else
              {
                j = i * i2 / j;
                i = i2;
                break label991;
              }
              i = paramVideoTransPara2.fps;
              continue;
            }
          }
          else
          {
            m += 1;
          }
        }
        else {
          return 0;
        }
      }
      catch (Exception paramArrayOff)
      {
        x.e("MicroMsg.BitrateCalculator", "do calc bitrate error: " + paramArrayOff.toString());
        return 0;
      }
      int n = i;
      int i = j;
      int j = n;
      break label1011;
      label865:
      n = i;
      i = j;
      j = n;
      break label922;
      label878:
      int m = 0;
      continue;
      label884:
      if (i * i2 > j * i1)
      {
        n = 1;
        continue;
        label902:
        j = j + 8 >> 4 << 4;
        i = i + 8 >> 4 << 4;
        label922:
        if (k != 0)
        {
          n = j;
          continue;
          label934:
          k = 0;
        }
      }
      else
      {
        n = 0;
        continue;
      }
      n = i;
      continue;
      label952:
      i = j;
      continue;
      label958:
      m += 1;
      continue;
      label967:
      m = 0;
      continue;
      label973:
      if (i * i2 > j * i1)
      {
        n = 1;
        continue;
        label991:
        j = j + 8 >> 4 << 4;
        i = i + 8 >> 4 << 4;
        label1011:
        if (k != 0)
        {
          n = j;
          continue;
        }
      }
      else
      {
        n = 0;
        continue;
      }
      n = i;
      continue;
      label1035:
      i = j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelcontrol/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */