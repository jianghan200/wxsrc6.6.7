package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bwa
  extends bhd
{
  public String hbL;
  public int rdY;
  public int reb;
  public int rgC;
  public int rjC;
  public bhy rtW;
  public String sso;
  public int ssp;
  public int ssq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.rtW != null)
      {
        paramVarArgs.fV(3, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.fT(4, this.rjC);
      if (this.sso != null) {
        paramVarArgs.g(5, this.sso);
      }
      paramVarArgs.fT(6, this.rgC);
      paramVarArgs.fT(7, this.ssp);
      paramVarArgs.fT(8, this.reb);
      paramVarArgs.fT(9, this.ssq);
      paramVarArgs.fT(10, this.rdY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label798;
      }
    }
    label798:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.rtW != null) {
        i = paramInt + f.a.a.a.fS(3, this.rtW.boi());
      }
      i += f.a.a.a.fQ(4, this.rjC);
      paramInt = i;
      if (this.sso != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sso);
      }
      return paramInt + f.a.a.a.fQ(6, this.rgC) + f.a.a.a.fQ(7, this.ssp) + f.a.a.a.fQ(8, this.reb) + f.a.a.a.fQ(9, this.ssq) + f.a.a.a.fQ(10, this.rdY);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bwa localbwa = (bwa)paramVarArgs[1];
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
            localbwa.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbwa.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbwa.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localbwa.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbwa.sso = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbwa.rgC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbwa.ssp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbwa.reb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbwa.ssq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbwa.rdY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */