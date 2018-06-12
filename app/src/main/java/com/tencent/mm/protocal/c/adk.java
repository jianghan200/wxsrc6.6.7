package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class adk
  extends bhd
{
  public String extra;
  public int qZv;
  public b rHQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.qZv);
      if (this.extra != null) {
        paramVarArgs.g(3, this.extra);
      }
      if (this.rHQ != null) {
        paramVarArgs.b(4, this.rHQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label419;
      }
    }
    label419:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.qZv);
      paramInt = i;
      if (this.extra != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.extra);
      }
      i = paramInt;
      if (this.rHQ != null) {
        i = paramInt + f.a.a.a.a(4, this.rHQ);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        adk localadk = (adk)paramVarArgs[1];
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
            localadk.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localadk.qZv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localadk.extra = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localadk.rHQ = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */