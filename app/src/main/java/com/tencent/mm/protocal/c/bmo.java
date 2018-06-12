package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bmo
  extends bhp
{
  public bhy rKi;
  public bhy rKj;
  public bhy rKk;
  public float rYk;
  public int rgC;
  public int skL;
  public bhy skM;
  public bhy skN;
  public bhy skO;
  public bhy skP;
  public bhy skQ;
  public int skR;
  public int skS;
  public String skT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.skM == null) {
        throw new b("Not all required fields were included: SongName");
      }
      if (this.skN == null) {
        throw new b("Not all required fields were included: SongSinger");
      }
      if (this.rKj == null) {
        throw new b("Not all required fields were included: SongAlbum");
      }
      if (this.rKk == null) {
        throw new b("Not all required fields were included: SongAlbumUrl");
      }
      if (this.skO == null) {
        throw new b("Not all required fields were included: SongWifiUrl");
      }
      if (this.skP == null) {
        throw new b("Not all required fields were included: SongWapLinkUrl");
      }
      if (this.skQ == null) {
        throw new b("Not all required fields were included: SongWebUrl");
      }
      if (this.rKi == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rgC);
      paramVarArgs.fT(3, this.skL);
      paramVarArgs.l(4, this.rYk);
      if (this.skM != null)
      {
        paramVarArgs.fV(5, this.skM.boi());
        this.skM.a(paramVarArgs);
      }
      if (this.skN != null)
      {
        paramVarArgs.fV(6, this.skN.boi());
        this.skN.a(paramVarArgs);
      }
      if (this.rKj != null)
      {
        paramVarArgs.fV(7, this.rKj.boi());
        this.rKj.a(paramVarArgs);
      }
      if (this.rKk != null)
      {
        paramVarArgs.fV(8, this.rKk.boi());
        this.rKk.a(paramVarArgs);
      }
      if (this.skO != null)
      {
        paramVarArgs.fV(9, this.skO.boi());
        this.skO.a(paramVarArgs);
      }
      if (this.skP != null)
      {
        paramVarArgs.fV(10, this.skP.boi());
        this.skP.a(paramVarArgs);
      }
      if (this.skQ != null)
      {
        paramVarArgs.fV(11, this.skQ.boi());
        this.skQ.a(paramVarArgs);
      }
      if (this.rKi != null)
      {
        paramVarArgs.fV(12, this.rKi.boi());
        this.rKi.a(paramVarArgs);
      }
      paramVarArgs.fT(13, this.skR);
      paramVarArgs.fT(14, this.skS);
      if (this.skT != null) {
        paramVarArgs.g(15, this.skT);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label2015;
      }
    }
    label2015:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rgC) + f.a.a.a.fQ(3, this.skL) + (f.a.a.b.b.a.ec(4) + 4);
      paramInt = i;
      if (this.skM != null) {
        paramInt = i + f.a.a.a.fS(5, this.skM.boi());
      }
      i = paramInt;
      if (this.skN != null) {
        i = paramInt + f.a.a.a.fS(6, this.skN.boi());
      }
      paramInt = i;
      if (this.rKj != null) {
        paramInt = i + f.a.a.a.fS(7, this.rKj.boi());
      }
      i = paramInt;
      if (this.rKk != null) {
        i = paramInt + f.a.a.a.fS(8, this.rKk.boi());
      }
      paramInt = i;
      if (this.skO != null) {
        paramInt = i + f.a.a.a.fS(9, this.skO.boi());
      }
      i = paramInt;
      if (this.skP != null) {
        i = paramInt + f.a.a.a.fS(10, this.skP.boi());
      }
      paramInt = i;
      if (this.skQ != null) {
        paramInt = i + f.a.a.a.fS(11, this.skQ.boi());
      }
      i = paramInt;
      if (this.rKi != null) {
        i = paramInt + f.a.a.a.fS(12, this.rKi.boi());
      }
      i = i + f.a.a.a.fQ(13, this.skR) + f.a.a.a.fQ(14, this.skS);
      paramInt = i;
      if (this.skT != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.skT);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.skM == null) {
          throw new b("Not all required fields were included: SongName");
        }
        if (this.skN == null) {
          throw new b("Not all required fields were included: SongSinger");
        }
        if (this.rKj == null) {
          throw new b("Not all required fields were included: SongAlbum");
        }
        if (this.rKk == null) {
          throw new b("Not all required fields were included: SongAlbumUrl");
        }
        if (this.skO == null) {
          throw new b("Not all required fields were included: SongWifiUrl");
        }
        if (this.skP == null) {
          throw new b("Not all required fields were included: SongWapLinkUrl");
        }
        if (this.skQ == null) {
          throw new b("Not all required fields were included: SongWebUrl");
        }
        if (this.rKi != null) {
          break;
        }
        throw new b("Not all required fields were included: SongLyric");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bmo localbmo = (bmo)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbmo.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbmo.skL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbmo.rYk = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.skM = ((bhy)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.skN = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.rKj = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.rKk = ((bhy)localObject1);
            paramInt += 1;
          }
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.skO = ((bhy)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.skP = ((bhy)localObject1);
            paramInt += 1;
          }
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.skQ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 12: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmo.rKi = ((bhy)localObject1);
            paramInt += 1;
          }
        case 13: 
          localbmo.skR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbmo.skS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbmo.skT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */