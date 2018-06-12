package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bqf
  extends bhp
{
  public bqd rTk;
  public int rXE;
  public LinkedList<boy> rgH = new LinkedList();
  public bpp smA;
  public String smu;
  public int smy;
  public int snV;
  public int soe;
  public long sof;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.smu != null) {
        paramVarArgs.g(2, this.smu);
      }
      paramVarArgs.fT(3, this.rXE);
      paramVarArgs.d(4, 8, this.rgH);
      paramVarArgs.fT(5, this.soe);
      if (this.rTk != null)
      {
        paramVarArgs.fV(6, this.rTk.boi());
        this.rTk.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.snV);
      paramVarArgs.fT(8, this.smy);
      if (this.smA != null)
      {
        paramVarArgs.fV(9, this.smA.boi());
        this.smA.a(paramVarArgs);
      }
      paramVarArgs.T(10, this.sof);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label986;
      }
    }
    label986:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.smu != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.smu);
      }
      i = i + f.a.a.a.fQ(3, this.rXE) + f.a.a.a.c(4, 8, this.rgH) + f.a.a.a.fQ(5, this.soe);
      paramInt = i;
      if (this.rTk != null) {
        paramInt = i + f.a.a.a.fS(6, this.rTk.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.snV) + f.a.a.a.fQ(8, this.smy);
      paramInt = i;
      if (this.smA != null) {
        paramInt = i + f.a.a.a.fS(9, this.smA.boi());
      }
      return paramInt + f.a.a.a.S(10, this.sof);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rgH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bqf localbqf = (bqf)paramVarArgs[1];
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
            localbqf.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbqf.smu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbqf.rXE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new boy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((boy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqf.rgH.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbqf.soe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bqd();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bqd)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqf.rTk = ((bqd)localObject1);
            paramInt += 1;
          }
        case 7: 
          localbqf.snV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbqf.smy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bpp();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbqf.smA = ((bpp)localObject1);
            paramInt += 1;
          }
        }
        localbqf.sof = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */