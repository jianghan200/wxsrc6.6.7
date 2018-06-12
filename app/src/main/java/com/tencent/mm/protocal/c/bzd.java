package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bzd
  extends bhd
{
  public int rEv;
  public long rxH;
  public long see;
  public int sef;
  public long svs;
  public String svt;
  
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
      paramVarArgs.fT(2, this.sef);
      paramVarArgs.T(3, this.svs);
      paramVarArgs.T(4, this.rxH);
      if (this.svt != null) {
        paramVarArgs.g(5, this.svt);
      }
      paramVarArgs.T(6, this.see);
      paramVarArgs.fT(7, this.rEv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label519;
      }
    }
    label519:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sef) + f.a.a.a.S(3, this.svs) + f.a.a.a.S(4, this.rxH);
      paramInt = i;
      if (this.svt != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.svt);
      }
      return paramInt + f.a.a.a.S(6, this.see) + f.a.a.a.fQ(7, this.rEv);
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
        bzd localbzd = (bzd)paramVarArgs[1];
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
            localbzd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbzd.sef = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbzd.svs = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localbzd.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localbzd.svt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbzd.see = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbzd.rEv = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */