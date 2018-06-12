package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ka
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rlH;
  public com.tencent.mm.bk.b rlI;
  public LinkedList<blk> rlJ = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlH == null) {
        throw new f.a.a.b("Not all required fields were included: Title");
      }
      if (this.rlI == null) {
        throw new f.a.a.b("Not all required fields were included: ServiceUrl");
      }
      if (this.rlH != null) {
        paramVarArgs.b(1, this.rlH);
      }
      if (this.rlI != null) {
        paramVarArgs.b(2, this.rlI);
      }
      paramVarArgs.d(3, 8, this.rlJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rlH == null) {
        break label429;
      }
    }
    label429:
    for (paramInt = f.a.a.a.a(1, this.rlH) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rlI != null) {
        i = paramInt + f.a.a.a.a(2, this.rlI);
      }
      return i + f.a.a.a.c(3, 8, this.rlJ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rlJ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rlH == null) {
          throw new f.a.a.b("Not all required fields were included: Title");
        }
        if (this.rlI != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: ServiceUrl");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ka localka = (ka)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localka.rlH = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 2: 
          localka.rlI = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new blk();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((blk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localka.rlJ.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */