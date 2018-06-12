package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cbw
  extends com.tencent.mm.bk.a
{
  public String sxH;
  public cay sxM;
  public String sxX;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxM == null) {
        throw new b("Not all required fields were included: base_request");
      }
      if (this.sxM != null)
      {
        paramVarArgs.fV(1, this.sxM.boi());
        this.sxM.a(paramVarArgs);
      }
      if (this.username != null) {
        paramVarArgs.g(2, this.username);
      }
      if (this.sxH != null) {
        paramVarArgs.g(3, this.sxH);
      }
      if (this.sxX != null) {
        paramVarArgs.g(4, this.sxX);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxM == null) {
        break label470;
      }
    }
    label470:
    for (int i = f.a.a.a.fS(1, this.sxM.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.username);
      }
      i = paramInt;
      if (this.sxH != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sxH);
      }
      paramInt = i;
      if (this.sxX != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sxX);
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
        if (this.sxM != null) {
          break;
        }
        throw new b("Not all required fields were included: base_request");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cbw localcbw = (cbw)paramVarArgs[1];
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
            localObject1 = new cay();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cay)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcbw.sxM = ((cay)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcbw.username = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcbw.sxH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localcbw.sxX = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */