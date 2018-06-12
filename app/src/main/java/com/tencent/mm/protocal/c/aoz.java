package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class aoz
  extends bhd
{
  public b hbs;
  public String jQb;
  public int rRa;
  public int rRb;
  public chf rRc;
  public String rRj;
  
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
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.hbs != null) {
        paramVarArgs.b(3, this.hbs);
      }
      if (this.rRj != null) {
        paramVarArgs.g(4, this.rRj);
      }
      paramVarArgs.fT(5, this.rRa);
      paramVarArgs.fT(6, this.rRb);
      if (this.rRc != null)
      {
        paramVarArgs.fV(7, this.rRc.boi());
        this.rRc.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label662;
      }
    }
    label662:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(3, this.hbs);
      }
      paramInt = i;
      if (this.rRj != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rRj);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rRa) + f.a.a.a.fQ(6, this.rRb);
      paramInt = i;
      if (this.rRc != null) {
        paramInt = i + f.a.a.a.fS(7, this.rRc.boi());
      }
      return paramInt;
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
        aoz localaoz = (aoz)paramVarArgs[1];
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
            localaoz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaoz.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaoz.hbs = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 4: 
          localaoz.rRj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaoz.rRa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localaoz.rRb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new chf();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((chf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localaoz.rRc = ((chf)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aoz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */