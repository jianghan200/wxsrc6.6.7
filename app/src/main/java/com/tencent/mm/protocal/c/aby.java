package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aby
  extends com.tencent.mm.bk.a
{
  public int rGA;
  public int rGB;
  public int rGC = 1;
  public int rGD;
  public bhz rGz;
  public int rcr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rGz == null) {
        throw new b("Not all required fields were included: ChatroomId");
      }
      if (this.rGz != null)
      {
        paramVarArgs.fV(1, this.rGz.boi());
        this.rGz.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rcr);
      paramVarArgs.fT(3, this.rGA);
      paramVarArgs.fT(4, this.rGB);
      paramVarArgs.fT(5, this.rGC);
      paramVarArgs.fT(6, this.rGD);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rGz == null) {
        break label492;
      }
    }
    label492:
    for (paramInt = f.a.a.a.fS(1, this.rGz.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rcr) + f.a.a.a.fQ(3, this.rGA) + f.a.a.a.fQ(4, this.rGB) + f.a.a.a.fQ(5, this.rGC) + f.a.a.a.fQ(6, this.rGD);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rGz != null) {
          break;
        }
        throw new b("Not all required fields were included: ChatroomId");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aby localaby = (aby)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localaby.rGz = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaby.rcr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localaby.rGA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localaby.rGB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaby.rGC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaby.rGD = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/aby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */