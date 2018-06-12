package com.tencent.mm.plugin.product.c;

import java.util.LinkedList;

public final class m
  extends com.tencent.mm.bk.a
{
  public String lRU;
  public String lRV;
  public LinkedList<h> lRW = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lRU != null) {
        paramVarArgs.g(1, this.lRU);
      }
      if (this.lRV != null) {
        paramVarArgs.g(2, this.lRV);
      }
      paramVarArgs.d(3, 8, this.lRW);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lRU == null) {
        break label367;
      }
    }
    label367:
    for (paramInt = f.a.a.b.b.a.h(1, this.lRU) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lRV != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.lRV);
      }
      return i + f.a.a.a.c(3, 8, this.lRW);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.lRW.clear();
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
        m localm = (m)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localm.lRU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localm.lRV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((h)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localm.lRW.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/product/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */