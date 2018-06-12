package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbx
  extends bhd
{
  public String sei;
  public String sej;
  public String sek;
  public String sel;
  public String sem;
  public int sen;
  
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
      if (this.sei != null) {
        paramVarArgs.g(2, this.sei);
      }
      if (this.sej != null) {
        paramVarArgs.g(3, this.sej);
      }
      if (this.sek != null) {
        paramVarArgs.g(4, this.sek);
      }
      if (this.sel != null) {
        paramVarArgs.g(5, this.sel);
      }
      if (this.sem != null) {
        paramVarArgs.g(6, this.sem);
      }
      paramVarArgs.fT(7, this.sen);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label587;
      }
    }
    label587:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sei != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sei);
      }
      i = paramInt;
      if (this.sej != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sej);
      }
      paramInt = i;
      if (this.sek != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sek);
      }
      i = paramInt;
      if (this.sel != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sel);
      }
      paramInt = i;
      if (this.sem != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sem);
      }
      return paramInt + f.a.a.a.fQ(7, this.sen);
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
        bbx localbbx = (bbx)paramVarArgs[1];
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
            localbbx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbx.sei = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbbx.sej = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbbx.sek = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbbx.sel = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbbx.sem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbbx.sen = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */