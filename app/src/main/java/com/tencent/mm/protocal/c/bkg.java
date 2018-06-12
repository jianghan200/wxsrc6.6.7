package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bkg
  extends bhd
{
  public String hbL;
  public String jSA;
  public int rKl;
  public int rZh;
  public String sjW;
  
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
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.jSA != null) {
        paramVarArgs.g(3, this.jSA);
      }
      paramVarArgs.fT(4, this.rZh);
      paramVarArgs.fT(5, this.rKl);
      if (this.sjW != null) {
        paramVarArgs.g(6, this.sjW);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label516;
      }
    }
    label516:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSA);
      }
      i = i + f.a.a.a.fQ(4, this.rZh) + f.a.a.a.fQ(5, this.rKl);
      paramInt = i;
      if (this.sjW != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sjW);
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
        bkg localbkg = (bkg)paramVarArgs[1];
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
            localbkg.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbkg.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbkg.jSA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbkg.rZh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbkg.rKl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbkg.sjW = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */