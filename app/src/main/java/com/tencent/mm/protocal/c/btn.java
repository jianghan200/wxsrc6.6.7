package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class btn
  extends bhd
{
  public String bRr;
  public String soj;
  public String sok;
  public String sol;
  
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
      if (this.sok != null) {
        paramVarArgs.g(2, this.sok);
      }
      if (this.soj != null) {
        paramVarArgs.g(3, this.soj);
      }
      if (this.sol != null) {
        paramVarArgs.g(4, this.sol);
      }
      if (this.bRr != null) {
        paramVarArgs.g(5, this.bRr);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label493;
      }
    }
    label493:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sok != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sok);
      }
      i = paramInt;
      if (this.soj != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.soj);
      }
      paramInt = i;
      if (this.sol != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sol);
      }
      i = paramInt;
      if (this.bRr != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.bRr);
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
        btn localbtn = (btn)paramVarArgs[1];
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
            localbtn.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbtn.sok = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbtn.soj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbtn.sol = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbtn.bRr = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/btn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */