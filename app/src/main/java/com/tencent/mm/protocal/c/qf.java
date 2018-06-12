package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class qf
  extends bhd
{
  public String ruF;
  public String ruG;
  public String ruH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruF == null) {
        throw new b("Not all required fields were included: corp_id");
      }
      if (this.ruG == null) {
        throw new b("Not all required fields were included: qychat_type");
      }
      if (this.ruH == null) {
        throw new b("Not all required fields were included: qychat_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruF != null) {
        paramVarArgs.g(2, this.ruF);
      }
      if (this.ruG != null) {
        paramVarArgs.g(3, this.ruG);
      }
      if (this.ruH != null) {
        paramVarArgs.g(4, this.ruH);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label538;
      }
    }
    label538:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ruF != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ruF);
      }
      i = paramInt;
      if (this.ruG != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ruG);
      }
      paramInt = i;
      if (this.ruH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ruH);
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
        if (this.ruF == null) {
          throw new b("Not all required fields were included: corp_id");
        }
        if (this.ruG == null) {
          throw new b("Not all required fields were included: qychat_type");
        }
        if (this.ruH != null) {
          break;
        }
        throw new b("Not all required fields were included: qychat_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        qf localqf = (qf)paramVarArgs[1];
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
            localqf.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localqf.ruF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localqf.ruG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localqf.ruH = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */