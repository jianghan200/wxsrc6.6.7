package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bxv
  extends bhd
{
  public int qZc;
  public bhz rMn;
  public bhy rgk;
  public String rhU;
  public bhz rhY;
  public bhy rhZ;
  public int skH;
  public String stV;
  public bhz stW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.qZc);
      if (this.stV != null) {
        paramVarArgs.g(3, this.stV);
      }
      if (this.rhU != null) {
        paramVarArgs.g(4, this.rhU);
      }
      if (this.rMn != null)
      {
        paramVarArgs.fV(5, this.rMn.boi());
        this.rMn.a(paramVarArgs);
      }
      if (this.stW != null)
      {
        paramVarArgs.fV(6, this.stW.boi());
        this.stW.a(paramVarArgs);
      }
      if (this.rhY != null)
      {
        paramVarArgs.fV(7, this.rhY.boi());
        this.rhY.a(paramVarArgs);
      }
      if (this.rhZ != null)
      {
        paramVarArgs.fV(8, this.rhZ.boi());
        this.rhZ.a(paramVarArgs);
      }
      paramVarArgs.fT(9, this.skH);
      if (this.rgk != null)
      {
        paramVarArgs.fV(10, this.rgk.boi());
        this.rgk.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1206;
      }
    }
    label1206:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZc);
      paramInt = i;
      if (this.stV != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.stV);
      }
      i = paramInt;
      if (this.rhU != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rhU);
      }
      paramInt = i;
      if (this.rMn != null) {
        paramInt = i + f.a.a.a.fS(5, this.rMn.boi());
      }
      i = paramInt;
      if (this.stW != null) {
        i = paramInt + f.a.a.a.fS(6, this.stW.boi());
      }
      paramInt = i;
      if (this.rhY != null) {
        paramInt = i + f.a.a.a.fS(7, this.rhY.boi());
      }
      i = paramInt;
      if (this.rhZ != null) {
        i = paramInt + f.a.a.a.fS(8, this.rhZ.boi());
      }
      i += f.a.a.a.fQ(9, this.skH);
      paramInt = i;
      if (this.rgk != null) {
        paramInt = i + f.a.a.a.fS(10, this.rgk.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bxv localbxv = (bxv)paramVarArgs[1];
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
            localbxv.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbxv.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbxv.stV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbxv.rhU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxv.rMn = ((bhz)localObject1);
            paramInt += 1;
          }
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxv.stW = ((bhz)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxv.rhY = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxv.rhZ = ((bhy)localObject1);
            paramInt += 1;
          }
        case 9: 
          localbxv.skH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbxv.rgk = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */