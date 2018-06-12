package com.tencent.mm.plugin.exdevice.e;

import java.util.LinkedList;

public final class k
  extends i
{
  public com.tencent.mm.bk.b hbs;
  public int hcE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbs == null) {
        throw new f.a.a.b("Not all required fields were included: Data");
      }
      if (this.ixi != null)
      {
        paramVarArgs.fV(1, this.ixi.boi());
        this.ixi.a(paramVarArgs);
      }
      if (this.hbs != null) {
        paramVarArgs.b(2, this.hbs);
      }
      paramVarArgs.fT(3, this.hcE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ixi == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = f.a.a.a.fS(1, this.ixi.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(2, this.hbs);
      }
      return i + f.a.a.a.fQ(3, this.hcE);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = i.a(paramVarArgs); paramInt > 0; paramInt = i.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hbs != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        k localk = (k)paramVarArgs[1];
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
            localObject1 = new d();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, i.a((f.a.a.a.a)localObject2))) {}
            localk.ixi = ((d)localObject1);
            paramInt += 1;
          }
        case 2: 
          localk.hbs = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localk.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */