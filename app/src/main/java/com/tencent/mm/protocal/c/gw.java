package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class gw
  extends bhd
{
  public int bVB;
  public String pqM;
  public String rhb;
  public String rhc;
  public String rhd;
  
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
      if (this.rhb != null) {
        paramVarArgs.g(2, this.rhb);
      }
      if (this.rhc != null) {
        paramVarArgs.g(3, this.rhc);
      }
      if (this.pqM != null) {
        paramVarArgs.g(4, this.pqM);
      }
      if (this.rhd != null) {
        paramVarArgs.g(5, this.rhd);
      }
      paramVarArgs.fT(7, this.bVB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label536;
      }
    }
    label536:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rhb);
      }
      i = paramInt;
      if (this.rhc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhc);
      }
      paramInt = i;
      if (this.pqM != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pqM);
      }
      i = paramInt;
      if (this.rhd != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rhd);
      }
      return i + f.a.a.a.fQ(7, this.bVB);
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
        gw localgw = (gw)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 6: 
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
            localgw.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localgw.rhb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localgw.rhc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localgw.pqM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localgw.rhd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localgw.bVB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */