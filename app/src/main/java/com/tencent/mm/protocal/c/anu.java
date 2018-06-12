package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class anu
  extends bhd
{
  public int hLg;
  public int rQx;
  public String rQy;
  public LinkedList<ati> rbQ = new LinkedList();
  public bhz rbR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rbR == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hLg);
      paramVarArgs.d(3, 8, this.rbQ);
      if (this.rbR != null)
      {
        paramVarArgs.fV(4, this.rbR.boi());
        this.rbR.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rQx);
      if (this.rQy != null) {
        paramVarArgs.g(6, this.rQy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label720;
      }
    }
    label720:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hLg) + f.a.a.a.c(3, 8, this.rbQ);
      paramInt = i;
      if (this.rbR != null) {
        paramInt = i + f.a.a.a.fS(4, this.rbR.boi());
      }
      i = paramInt + f.a.a.a.fQ(5, this.rQx);
      paramInt = i;
      if (this.rQy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rQy);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rbQ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rbR != null) {
          break;
        }
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        anu localanu = (anu)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localanu.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localanu.hLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ati();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ati)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localanu.rbQ.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localanu.rbR = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localanu.rQx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localanu.rQy = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/anu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */