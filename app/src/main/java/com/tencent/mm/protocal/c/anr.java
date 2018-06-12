package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class anr
  extends bhd
{
  public String rQt;
  public LinkedList<String> rQu = new LinkedList();
  public String ruF;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruF == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.rQt == null) {
        throw new b("Not all required fields were included: bizchat_name");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruF != null) {
        paramVarArgs.g(2, this.ruF);
      }
      if (this.rQt != null) {
        paramVarArgs.g(3, this.rQt);
      }
      paramVarArgs.d(4, 1, this.rQu);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label502;
      }
    }
    label502:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruF != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruF);
      }
      i = paramInt;
      if (this.rQt != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rQt);
      }
      return i + f.a.a.a.c(4, 1, this.rQu);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rQu.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ruF == null) {
          throw new b("Not all required fields were included: corp_id");
        }
        if (this.rQt != null) {
          break;
        }
        throw new b("Not all required fields were included: bizchat_name");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        anr localanr = (anr)paramVarArgs[1];
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
            localanr.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localanr.ruF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localanr.rQt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localanr.rQu.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/anr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */