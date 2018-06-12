package com.tencent.mm.plugin.sns.g;

import com.tencent.mm.protocal.c.boi;
import f.a.a.b;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bk.a
{
  public boi nnO;
  public String nuY;
  public int nuZ;
  public String nva;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.nuY == null) {
        throw new b("Not all required fields were included: clientID");
      }
      if (this.nnO == null) {
        throw new b("Not all required fields were included: actionGroup");
      }
      if (this.nuY != null) {
        paramVarArgs.g(1, this.nuY);
      }
      if (this.nnO != null)
      {
        paramVarArgs.fV(2, this.nnO.boi());
        this.nnO.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.nuZ);
      if (this.nva != null) {
        paramVarArgs.g(4, this.nva);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.nuY == null) {
        break label490;
      }
    }
    label490:
    for (paramInt = f.a.a.b.b.a.h(1, this.nuY) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.nnO != null) {
        i = paramInt + f.a.a.a.fS(2, this.nnO.boi());
      }
      i += f.a.a.a.fQ(3, this.nuZ);
      paramInt = i;
      if (this.nva != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.nva);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.nuY == null) {
          throw new b("Not all required fields were included: clientID");
        }
        if (this.nnO != null) {
          break;
        }
        throw new b("Not all required fields were included: actionGroup");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        e locale = (e)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locale.nuY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new boi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((boi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locale.nnO = ((boi)localObject1);
            paramInt += 1;
          }
        case 3: 
          locale.nuZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        locale.nva = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */