package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class zq
  extends bhp
{
  public int hwV;
  public String hwW;
  public int rFw;
  public String rFx;
  public String rFy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.fT(4, this.rFw);
      if (this.rFx != null) {
        paramVarArgs.g(5, this.rFx);
      }
      if (this.rFy != null) {
        paramVarArgs.g(6, this.rFy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label516;
      }
    }
    label516:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rFw);
      paramInt = i;
      if (this.rFx != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rFx);
      }
      i = paramInt;
      if (this.rFy != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rFy);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        zq localzq = (zq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localzq.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localzq.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localzq.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localzq.rFw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localzq.rFx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localzq.rFy = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */