package d.a.a;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bk.a
{
  public String vHf;
  public String vHg;
  public String vHh;
  public String vHi;
  public String vHj;
  public int vHk;
  public d vHl;
  public b vHm;
  public b vHn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.vHf != null) {
        paramVarArgs.g(1, this.vHf);
      }
      if (this.vHg != null) {
        paramVarArgs.g(2, this.vHg);
      }
      if (this.vHh != null) {
        paramVarArgs.g(3, this.vHh);
      }
      if (this.vHi != null) {
        paramVarArgs.g(4, this.vHi);
      }
      if (this.vHj != null) {
        paramVarArgs.g(5, this.vHj);
      }
      paramVarArgs.fT(6, this.vHk);
      if (this.vHl != null)
      {
        paramVarArgs.fV(7, this.vHl.boi());
        this.vHl.a(paramVarArgs);
      }
      if (this.vHm != null) {
        paramVarArgs.b(8, this.vHm);
      }
      if (this.vHn != null) {
        paramVarArgs.b(9, this.vHn);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.vHf == null) {
        break label699;
      }
    }
    label699:
    for (int i = f.a.a.b.b.a.h(1, this.vHf) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vHg != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.vHg);
      }
      i = paramInt;
      if (this.vHh != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.vHh);
      }
      paramInt = i;
      if (this.vHi != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.vHi);
      }
      i = paramInt;
      if (this.vHj != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.vHj);
      }
      i += f.a.a.a.fQ(6, this.vHk);
      paramInt = i;
      if (this.vHl != null) {
        paramInt = i + f.a.a.a.fS(7, this.vHl.boi());
      }
      i = paramInt;
      if (this.vHm != null) {
        i = paramInt + f.a.a.a.a(8, this.vHm);
      }
      paramInt = i;
      if (this.vHn != null) {
        paramInt = i + f.a.a.a.a(9, this.vHn);
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
        break;
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
          locale.vHf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          locale.vHg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          locale.vHh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locale.vHi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          locale.vHj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locale.vHk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new d();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locale.vHl = ((d)localObject1);
            paramInt += 1;
          }
        case 8: 
          locale.vHm = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        locale.vHn = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/d/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */