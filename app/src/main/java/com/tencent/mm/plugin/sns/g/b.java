package com.tencent.mm.plugin.sns.g;

import com.tencent.mm.protocal.c.ate;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bk.a
{
  public ate caK;
  public int dTR;
  public String nuP;
  public int nuQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.caK != null)
      {
        paramVarArgs.fV(1, this.caK.boi());
        this.caK.a(paramVarArgs);
      }
      if (this.nuP != null) {
        paramVarArgs.g(2, this.nuP);
      }
      paramVarArgs.fT(3, this.dTR);
      paramVarArgs.fT(4, this.nuQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.caK == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.a.fS(1, this.caK.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nuP != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.nuP);
      }
      return i + f.a.a.a.fQ(3, this.dTR) + f.a.a.a.fQ(4, this.nuQ);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        b localb = (b)paramVarArgs[1];
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
            localObject1 = new ate();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ate)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localb.caK = ((ate)localObject1);
            paramInt += 1;
          }
        case 2: 
          localb.nuP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localb.dTR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localb.nuQ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */