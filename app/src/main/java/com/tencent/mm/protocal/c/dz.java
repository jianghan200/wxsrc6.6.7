package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class dz
  extends com.tencent.mm.bk.a
{
  public String qZs;
  public String rem;
  public tq ren;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rem == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.ren == null) {
        throw new b("Not all required fields were included: Price");
      }
      if (this.rem != null) {
        paramVarArgs.g(1, this.rem);
      }
      if (this.ren != null)
      {
        paramVarArgs.fV(2, this.ren.boi());
        this.ren.a(paramVarArgs);
      }
      if (this.qZs != null) {
        paramVarArgs.g(3, this.qZs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rem == null) {
        break label451;
      }
    }
    label451:
    for (int i = f.a.a.b.b.a.h(1, this.rem) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ren != null) {
        paramInt = i + f.a.a.a.fS(2, this.ren.boi());
      }
      i = paramInt;
      if (this.qZs != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.qZs);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rem == null) {
          throw new b("Not all required fields were included: ProductID");
        }
        if (this.ren != null) {
          break;
        }
        throw new b("Not all required fields were included: Price");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        dz localdz = (dz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localdz.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new tq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((tq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localdz.ren = ((tq)localObject1);
            paramInt += 1;
          }
        }
        localdz.qZs = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */