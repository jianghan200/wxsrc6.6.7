package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bco
  extends bhd
{
  public int rtK;
  public String seK;
  public int seL;
  public String seM;
  
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
      if (this.seK != null) {
        paramVarArgs.g(2, this.seK);
      }
      paramVarArgs.fT(3, this.seL);
      paramVarArgs.fT(4, this.rtK);
      if (this.seM != null) {
        paramVarArgs.g(5, this.seM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label457;
      }
    }
    label457:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.seK != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.seK);
      }
      i = i + f.a.a.a.fQ(3, this.seL) + f.a.a.a.fQ(4, this.rtK);
      paramInt = i;
      if (this.seM != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.seM);
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
        bco localbco = (bco)paramVarArgs[1];
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
            localbco.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbco.seK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbco.seL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbco.rtK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbco.seM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */