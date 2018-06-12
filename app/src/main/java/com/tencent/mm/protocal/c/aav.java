package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aav
  extends bhd
{
  public String data;
  public int nc;
  public String ruF;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruF == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.data == null) {
        throw new b("Not all required fields were included: data");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruF != null) {
        paramVarArgs.g(2, this.ruF);
      }
      paramVarArgs.fT(3, this.nc);
      if (this.data != null) {
        paramVarArgs.g(4, this.data);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label494;
      }
    }
    label494:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ruF != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.ruF);
      }
      i += f.a.a.a.fQ(3, this.nc);
      paramInt = i;
      if (this.data != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.data);
      }
      return paramInt;
      Object localObject1;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        localObject1 = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a((f.a.a.a.a)localObject1); paramInt > 0; paramInt = bhd.a((f.a.a.a.a)localObject1)) {
          if (!super.a((f.a.a.a.a)localObject1, this, paramInt)) {
            ((f.a.a.a.a)localObject1).cJS();
          }
        }
        if (this.ruF == null) {
          throw new b("Not all required fields were included: corp_id");
        }
        if (paramVarArgs != null) {
          break;
        }
        throw new b("Not all required fields were included: data");
      }
      if (paramInt == 3)
      {
        Object localObject2 = (f.a.a.a.a)paramVarArgs[0];
        localObject1 = (aav)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject2).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject3 = (byte[])paramVarArgs.get(paramInt);
            localObject2 = new fk();
            localObject3 = new f.a.a.a.a((byte[])localObject3, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject2).a((f.a.a.a.a)localObject3, (com.tencent.mm.bk.a)localObject2, bhd.a((f.a.a.a.a)localObject3))) {}
            ((aav)localObject1).shX = ((fk)localObject2);
            paramInt += 1;
          }
        case 2: 
          ((aav)localObject1).ruF = ((f.a.a.a.a)localObject2).vHC.readString();
          return 0;
        case 3: 
          ((aav)localObject1).nc = ((f.a.a.a.a)localObject2).vHC.rY();
          return 0;
        }
        ((aav)localObject1).data = ((f.a.a.a.a)localObject2).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */