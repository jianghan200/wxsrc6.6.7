package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwe
  extends bhd
{
  public int jSO;
  public int rdV;
  public int rdW;
  public int rdX;
  public bhy rtW;
  public int ssA;
  public bhz ssv;
  public bhz ssw;
  public int ssx;
  public int ssy;
  public int ssz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssv == null) {
        throw new b("Not all required fields were included: ClientMediaId");
      }
      if (this.ssw == null) {
        throw new b("Not all required fields were included: DataMD5");
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ssv != null)
      {
        paramVarArgs.fV(2, this.ssv.boi());
        this.ssv.a(paramVarArgs);
      }
      if (this.ssw != null)
      {
        paramVarArgs.fV(3, this.ssw.boi());
        this.ssw.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rdV);
      paramVarArgs.fT(5, this.rdW);
      paramVarArgs.fT(6, this.rdX);
      if (this.rtW != null)
      {
        paramVarArgs.fV(7, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.jSO);
      paramVarArgs.fT(9, this.ssx);
      paramVarArgs.fT(10, this.ssy);
      paramVarArgs.fT(11, this.ssz);
      paramVarArgs.fT(12, this.ssA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1128;
      }
    }
    label1128:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ssv != null) {
        paramInt = i + f.a.a.a.fS(2, this.ssv.boi());
      }
      i = paramInt;
      if (this.ssw != null) {
        i = paramInt + f.a.a.a.fS(3, this.ssw.boi());
      }
      i = i + f.a.a.a.fQ(4, this.rdV) + f.a.a.a.fQ(5, this.rdW) + f.a.a.a.fQ(6, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(7, this.rtW.boi());
      }
      return paramInt + f.a.a.a.fQ(8, this.jSO) + f.a.a.a.fQ(9, this.ssx) + f.a.a.a.fQ(10, this.ssy) + f.a.a.a.fQ(11, this.ssz) + f.a.a.a.fQ(12, this.ssA);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ssv == null) {
          throw new b("Not all required fields were included: ClientMediaId");
        }
        if (this.ssw == null) {
          throw new b("Not all required fields were included: DataMD5");
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwe localbwe = (bwe)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwe.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwe.ssv = ((bhz)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwe.ssw = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          localbwe.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbwe.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbwe.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwe.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbwe.jSO = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbwe.ssx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbwe.ssy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbwe.ssz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbwe.ssA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bwe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */