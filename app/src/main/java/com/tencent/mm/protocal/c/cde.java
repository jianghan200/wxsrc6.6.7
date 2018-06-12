package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cde
  extends bhd
{
  public String bWm;
  public int syH;
  public String syL;
  public String syM;
  public String syS;
  
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
      if (this.bWm != null) {
        paramVarArgs.g(2, this.bWm);
      }
      paramVarArgs.fT(3, this.syH);
      if (this.syL != null) {
        paramVarArgs.g(99, this.syL);
      }
      if (this.syM != null) {
        paramVarArgs.g(100, this.syM);
      }
      if (this.syS != null) {
        paramVarArgs.g(101, this.syS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label556;
      }
    }
    label556:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bWm != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bWm);
      }
      i += f.a.a.a.fQ(3, this.syH);
      paramInt = i;
      if (this.syL != null) {
        paramInt = i + f.a.a.b.b.a.h(99, this.syL);
      }
      i = paramInt;
      if (this.syM != null) {
        i = paramInt + f.a.a.b.b.a.h(100, this.syM);
      }
      paramInt = i;
      if (this.syS != null) {
        paramInt = i + f.a.a.b.b.a.h(101, this.syS);
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
        cde localcde = (cde)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcde.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcde.bWm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcde.syH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 99: 
          localcde.syL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 100: 
          localcde.syM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localcde.syS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cde.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */