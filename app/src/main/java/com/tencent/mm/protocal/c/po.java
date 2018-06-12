package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class po
  extends com.tencent.mm.bk.a
{
  public String rtO;
  public String rtP;
  public LinkedList<atq> rtQ = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rtO != null) {
        paramVarArgs.g(1, this.rtO);
      }
      if (this.rtP != null) {
        paramVarArgs.g(2, this.rtP);
      }
      paramVarArgs.d(3, 8, this.rtQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rtO == null) {
        break label367;
      }
    }
    label367:
    for (paramInt = f.a.a.b.b.a.h(1, this.rtO) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rtP != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rtP);
      }
      return i + f.a.a.a.c(3, 8, this.rtQ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rtQ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        po localpo = (po)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localpo.rtO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localpo.rtP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new atq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((atq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localpo.rtQ.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */